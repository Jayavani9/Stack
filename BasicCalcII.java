227. Basic Calculator II

Given a string s which represents an expression, evaluate this expression and return its value. 
The integer division should truncate toward zero.
You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

Example 1:
Input: s = "3+2*2"
Output: 7
  
Example 2:
Input: s = " 3/2 "
Output: 1
  
Example 3:
Input: s = " 3+5 / 2 "
Output: 5


class Solution {
    public int calculate(String s) {
      //Tc: O(n) and Sc: O(n)
        if(s == null || s.isEmpty()) return 0;
        int num = 0;
        char sign = '+';
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                num = num * 10 + (c-'0');

            }
            if(!Character.isDigit(c) && c!= ' ' || i == s.length()-1)
            {
                if(sign == '+') st.push(num);
                else if(sign == '-') st.push(-num);
                else if(sign == '*') st.push(st.pop()*num);
                else if(sign == '/') st.push(st.pop()/num);
                 sign = c;
                 num = 0;
            }
        }

        int res = 0;
        while(!st.isEmpty())
        {
        res = res + st.pop();
        }
        return res;
    }
}
