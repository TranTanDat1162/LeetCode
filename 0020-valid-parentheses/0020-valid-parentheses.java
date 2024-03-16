class Solution {
    public boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If it's a closing bracket, check if the stack is empty
                if (stack.isEmpty()) {
                    return false; // There's no corresponding opening bracket
                }
                
                // Pop the top element from the stack
                char top = stack.pop();
                
                // Check if the popped opening bracket matches the current closing bracket
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        // If the stack is empty, all brackets were properly matched
        return stack.isEmpty();
    }
}