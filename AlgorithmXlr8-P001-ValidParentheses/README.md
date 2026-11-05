<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Valid Parentheses

**Difficulty:** `Easy`

## Problem

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

In the correct order means that the bracket opened last must be closed first, so brackets may be nested inside each other but may not cross, as in "([)]". A string that still has unclosed open brackets at the end is not valid.

Input format: a single line containing the string s.

Output format: print true if s is valid, otherwise print false.

## Examples

### Example 1

**Input**
```
s = "()[]{}"
```
**Output**
```
true
```

**Explanation:** Each open bracket is immediately closed by a bracket of the same type.

### Example 2

**Input**
```
s = "([)]"
```
**Output**
```
false
```

**Explanation:** The '[' is opened after '(' and must be closed first, but ')' arrives while '[' is still open.

### Example 3

**Input**
```
s = "{[]}"
```
**Output**
```
true
```

**Explanation:** The pair [] is nested inside {}, and both are closed in the correct order.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/valid-parentheses).