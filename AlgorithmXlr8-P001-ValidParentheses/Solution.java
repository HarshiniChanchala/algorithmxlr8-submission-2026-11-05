import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();

        for (char currentChar : s.toCharArray()) {

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }

                char topChar = stack.pop();

                if (currentChar == ')' && topChar != '(') {
                    System.out.println("false");
                    return;
                }

                if (currentChar == '}' && topChar != '{') {
                    System.out.println("false");
                    return;
                }

                if (currentChar == ']' && topChar != '[') {
                    System.out.println("false");
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty());
    }
}