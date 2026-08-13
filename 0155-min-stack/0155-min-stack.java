class MinStack {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-08-12                                             #
        #                                                                       #
        #########################################################################
        */
    Stack<Integer> stack;
    Stack<Integer> mini;
    public MinStack() {
        stack = new Stack<>();
        mini = new Stack<>();
    }
    
    public void push(int val)  {
        stack.push(val);
        if (mini.isEmpty() || val <= mini.peek())
            mini.push(val);
    }
    
    public void pop() {
        int k = stack.pop();
        if (k == mini.peek())
            mini.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */