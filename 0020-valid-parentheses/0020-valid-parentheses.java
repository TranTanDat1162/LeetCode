import java.util.*;

public class Solution {

    public static boolean isValid(String s) {
        Stack<Character> closeBracketStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                closeBracketStack.push(')');

            else if (c == '[')
                closeBracketStack.push(']');

            else if (c == '{')
                closeBracketStack.push('}');
            
            else if (closeBracketStack.isEmpty() || closeBracketStack.pop() != c) 
                return false;
        }
        
        return closeBracketStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]";
        System.out.println(isValid(s));

    }
}