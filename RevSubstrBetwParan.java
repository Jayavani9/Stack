1190. Reverse Substrings Between Each Pair of Parentheses

You are given a string s that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should not contain any brackets.


Example 1:

Input: s = "(abcd)"
Output: "dcba"
Example 2:

Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
Example 3:

Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

Solution:

class Solution {
    public String reverseParentheses(String s) {
        //Tc: O(N)  Sc: O(N)
        char[] arr = s.toCharArray();
        int start = -1;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length; i++)
        {
            char ch = arr[i];
            if(ch == '(') st.push(i);
            else if (ch == ')')
            {
                start = st.pop();
                reverse(arr, start, i);
            }
        }
        String ans = new String();
        for(char c: arr)
        {
            if(c != '(' && c != ')') ans += c;
        }

        return ans;
    }

    private void reverse(char[] arr, int start, int end)
    {
        while(start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
