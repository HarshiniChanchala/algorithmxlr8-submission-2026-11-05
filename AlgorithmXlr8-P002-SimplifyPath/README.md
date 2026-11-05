<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Simplify Path

**Difficulty:** `Medium`

## Problem

You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:
- A single period '.' represents the current directory.
- A double period '..' represents the previous/parent directory.
- Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
- Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.

The simplified canonical path should follow these rules:
- The path must start with a single slash '/'.
- Directories within the path must be separated by exactly one slash '/'.
- The path must not end with a slash '/', unless it is the root directory.
- The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.

Return the simplified canonical path. Going up with '..' from the root directory stays at the root, so the result is never above '/'.

Input format: A single line containing the path.

Output format: Print the simplified canonical path.

## Examples

### Example 1

**Input**
```
path = "/home/"
```
**Output**
```
"/home"
```

**Explanation:** The trailing slash is removed.

### Example 2

**Input**
```
path = "/home/user/Documents/../Pictures"
```
**Output**
```
"/home/user/Pictures"
```

**Explanation:** The '..' goes up from Documents back to /home/user, and then Pictures is entered.

### Example 3

**Input**
```
path = "/../"
```
**Output**
```
"/"
```

**Explanation:** Going up one level from the root directory is not possible, so the path stays at the root.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/simplify-path).