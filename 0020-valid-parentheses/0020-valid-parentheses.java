class Solution {
    public boolean isValid(String s) {
        Stack<Character> closedBrackets = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                closedBrackets.push(')');
            }
                
            else if (c == '[') {
                closedBrackets.push(']');
            }
            
            else if (c == '{') {
                closedBrackets.push('}');
            }
                
            else if (closedBrackets.isEmpty() || c != closedBrackets.pop())
                return false;
        }
                
        return closedBrackets.isEmpty();
    }
}