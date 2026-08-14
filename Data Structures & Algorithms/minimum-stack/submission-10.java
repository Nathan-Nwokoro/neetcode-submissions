class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
        if (val <= min) {
            min = val;
            minStack.add(val);
        }

    }
    
    public void pop() {
        if (stack.get(stack.size() - 1) == min) {
            minStack.remove(minStack.size() - 1);
            if (!minStack.isEmpty()) {
                min = minStack.get(minStack.size() - 1);
            } else {
                min = Integer.MAX_VALUE;
            }
        }
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        if (stack.size() > 0) {
            return stack.get(stack.size() - 1);
        }
        return -1;
    }
    
    public int getMin() {
        return min;
    }
}
