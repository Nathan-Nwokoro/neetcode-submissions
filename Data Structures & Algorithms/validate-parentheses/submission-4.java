class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        if (s == "" || length % 2 != 0) return false;
        for (int i = 0; i < length; i++) {
            if (i != length - 1 && (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')) {
                stack.push(s.charAt(i));
                continue;
            } else if (s.charAt(i) == ')' && stack.empty() == false && stack.peek() == '(') {
                stack.pop();
                continue;
            } else if (s.charAt(i) == ']' && stack.empty() == false && stack.peek() == '[') {
                stack.pop();
                continue;
            } else if (s.charAt(i) == '}' && stack.empty() == false && stack.peek() == '{') {
                stack.pop();
                continue;
            } else return false;

        }
        if (stack.empty() != true) {
            return false;
        }
        return true;
        
    }
}
