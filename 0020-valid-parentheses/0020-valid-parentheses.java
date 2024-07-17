class Solution {
    public boolean isValid(String s) {
        // Create the stack containing close bracket from string s
        Stack<Character> closeBracketStack = new Stack<>();

        // Check every single character in string s
        for (char c : s.toCharArray()) {
            /**
            * Catch if c is the open bracket, the stack will push the approriate close bracket
             */
            if (c == '(')
                closeBracketStack.push(')');

            else if (c == '[')
                closeBracketStack.push(']');

            else if (c == '{')
                closeBracketStack.push('}');

            // Firstly, we check if there is no open bracket in string before
            // It can be infered that theire is no close in close bracket => false
            // Then, check in close bracket, if the next characer is not the same as pop up from
            // stack => false 
            else if (closeBracketStack.isEmpty() || closeBracketStack.pop() != c)
                return false;
        }

        // Supposing the string s = "()["
        // For looping above, definitely we have "[" left, so we check if
        // stack is empty or not
        return closeBracketStack.isEmpty();
    }
}