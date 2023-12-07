844. Backspace String Compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty. 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(c);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (ch == '#') {
                if(!st2.isEmpty())
                {
                st2.pop();
                }
            } else {
                st2.push(ch);
            }
        }
        return st1.equals(st2);
    }
}
