
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
 
