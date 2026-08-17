class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t: tokens) {
            if (!"+-*/".contains(t)) {
                stack.push(Integer.valueOf(t));
                continue;
            }
            int num1 = stack.pop();
            int num2 = stack.pop();
            int sum = 0;
            switch (t) {
                case "+" :
                    sum = num2 + num1;
                    break;
                case "-" :
                    sum = num2 - num1;
                    break;
                case "*" :
                    sum = num2 * num1;
                    break;
                case "/" :
                    sum = num2 / num1;
                    break;
            }
            stack.push(sum);

        }
        return stack.pop();

    }
}
