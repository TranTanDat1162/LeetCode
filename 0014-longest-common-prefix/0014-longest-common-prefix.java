import java.util.*;

public class Solution {

    public static String longestCommonPrefix(String[] strings) {
        String result = strings[0];

        for (String str: strings) {
            while (str.indexOf(result) != 0)
                result = result.substring(0, result.length() - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
}