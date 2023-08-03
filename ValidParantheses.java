20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true
  
Example 2:
Input: s = "()[]{}"
Output: true
  
Example 3:
Input: s = "(]"
Output: false


class Solution {
    public boolean isValid(String s) {
      // Tc: O(n) and Sc: O(n)
       HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {

                if (st.isEmpty() || st.peek() != map.get(c)) {
                    return false;
                }
                st.pop(); 
            }
        }

        return st.isEmpty();
        
    }
}
