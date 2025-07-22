class MinStack {
    Node top;

    public MinStack() {
        top = null;
    }
    
    public void push(int val) {
        if (top == null) {
            top = new Node(val, val, null);
        } else {
            top = new Node(val, Math.min(val, top.min), top);
        }
    }
    
    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
}

class Node {
    int data;
    Node next;
    int min;

    Node(int data, int min, Node next) {
        this.data = data;
        this.next = next;
        this.min = min;
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