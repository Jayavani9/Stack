// https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1?page=1&category%5B%5D=Stack&sortBy=

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   Tc: O(1) Sc: O(1)
	   s1.push(x);
	   
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   Tc: O(n) Sc: O(n)
	    if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return -1; 
            }
 
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
   
}
