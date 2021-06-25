class MyStack {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {
        
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
       q1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
         while(q1.size()>1){
            q2.add(q1.poll());
        }
        int n=(int)q1.poll();
        Queue<Integer> q=new LinkedList<>();
        q=q1;
        q1=q2;
        q2=q;
        
        return n;
        
    }
    
    /** Get the top element. */
    public int top() {
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        Integer a=q1.peek();
        int n=(int)q1.poll();
        //System.out.println(n);
        q2.add(a);
        //System.out.println(q1);
        Queue<Integer> q=new LinkedList<>();
        q=q1;
        q1=q2;
        q2=q;
        
        
        return n;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.isEmpty()==true){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */