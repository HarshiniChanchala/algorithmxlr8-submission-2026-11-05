import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        // Write your solution here.
        // Convert path to its simplified canonical form: split on '/',
        // skip empty segments and '.', pop the stack on '..' (if not
        // empty), push any other token as a directory name. Print the
        // result, starting with '/'.

        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for(String part : parts){
            if(part.equals("")){
                continue;
            }
            if(part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else{
                stack.push(part);
            }
        }
        StringBuilder result = new StringBuilder();
        for(String dir : stack){
            result.append("/");
            result.append(dir);
        }
        if(result.length() == 0){
            System.out.println("/");
        }
        System.out.println(result.toString());
    }
}
