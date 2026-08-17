class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token: tokens) {
            if (!"+-*/".contains(token)) {
                stack.push(Integer.valueOf(token));
                continue;
            }
            int num1 = stack.pop();
            int num2 = stack.pop();
            int val = operation(num1, num2, token);
            stack.push(val);
        }
        return stack.pop();
        
    }

    public int operation(int num1, int num2, String token) {
        int val = 0;
        switch (token) {
            case "+":
                val = num2 + num1;
                break;
            case "-":
                val = num2 - num1;
                break;
            case "*":
                val = num2 * num1;
                break;
            case "/":
                val = num2 / num1;
                break;
        }
        return val;
    }
}
