class MinStack {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> min = new Stack<>();
    public MinStack() {
        // Write your code here
    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            min.push(val);
        }else{
            st.push(val);
            if(min.peek() < val){
                min.push(min.peek());
            }
            else{
                min.push(val);
            }
        }
    }

    public void pop() {
        // Write your code here
        if(!st.isEmpty()){
            st.pop();
            min.pop();
        }
    }

    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        return -1;
    }

    public int getMin() {
        if(!min.isEmpty()){
            return min.peek();
        }
        return -1;
    }
}