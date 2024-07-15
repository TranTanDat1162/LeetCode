import java.util.*;

public class Solution {

    public static int romanToInt(String s) {
        // Create hash map for storing each character into value in roman number
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Mapping data
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        // Create the result variable to store the integer from String s
        int result = 0;

        // Looping
        for (int i = 0; i < s.length(); i++) {
            // If there is the next character is greater than before it, make the logic the result
            if (i > 0 && hashMap.get(s.charAt(i)) > hashMap.get(s.charAt(i - 1)))
                result += hashMap.get(s.charAt(i)) - 2 * hashMap.get(s.charAt(i - 1));
            else
                result += hashMap.get(s.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}