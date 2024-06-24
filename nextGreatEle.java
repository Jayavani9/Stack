//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=1&category%5B%5D=Stack&sortBy=

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        //Tc: O(n) Sc: O(n) 
        long[] ans = new long[n];
       
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++)
        {   
            while(!st.isEmpty() && arr[i] > arr[st.peek()])
            {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        return ans;
    } 
}
