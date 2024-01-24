155. Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.


Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Solutions : 



class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        int minVal;
        if(!minSt.isEmpty())
        {
            minVal = Math.min(minSt.peek(),val);
            minSt.push(minVal);
        }
        else
        {
        minSt.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        if(!minSt.isEmpty())
        {
        return minSt.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

/*

1. Using a min variable 
    
class MinStack {
    public Stack<Integer> st;
    public Stack<Integer> minStack;
    int min;
    public MinStack() {
        min = Integer.MAX_VALUE;
        st = new Stack<>();
        minStack = new Stack<>();
        minStack.push(min);
    }
    
    public void push(int val) {
        st.push(val);
        min = Math.min(minStack.peek(),val);
        minStack.push(min);
        
    }
    
    public void pop() {
        st.pop();
        minStack.pop();


        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}


 //Your MinStack object will be instantiated and called as such:
 MinStack obj = new MinStack();
 obj.push(val);
 obj.pop();
 int param_3 = obj.top();
 int param_4 = obj.getMin();


2. Without using a min variable


class MinStack {

    public Stack<Integer> st = new Stack<>();
    public Stack<Integer> minSt = new Stack<>();

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
        minSt.push(val);
        }
        else 
        {
            minSt.push(minSt.peek());
        }
     
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
  
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minSt.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 
