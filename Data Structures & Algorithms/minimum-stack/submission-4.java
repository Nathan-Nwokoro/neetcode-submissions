class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minArray = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
        if (val < min) {
            min = val;
            minArray.add(min);
        } else {
            minArray.add(min);
        }
        
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        minArray.remove(minArray.size() - 1);
        if (minArray.size() != 0) {
            min = minArray.get(minArray.size() - 1);
        } else {
            min = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minArray.get(minArray.size() - 1);
    }
}
