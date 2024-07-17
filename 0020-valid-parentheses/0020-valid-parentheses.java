import java.util.*;

public class Solution {

    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '(')
                characterStack.push(')');
            else if (c == '[')
                characterStack.push(']');
            else if (c == '{')
                characterStack.push('}');
            else if (characterStack.isEmpty() || characterStack.pop() != c)
                return false;
        }

        return characterStack.isEmpty();
    }

}