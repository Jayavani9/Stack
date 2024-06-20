//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&company=Amazon&sortBy=submissions

//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    //Tc: O(n) Sc: O(n) 
    static boolean ispar(String x)
    {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        // add your code here
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < x.length(); i++)
        {
            char ch = x.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);
            }
            
            else if(st.isEmpty() || st.pop() != map.get(ch))
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}
