class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        // reverse the string
        sb.reverse();

        // check if the reversed string is equal to the original string
        return String.valueOf(x).contentEquals(sb);
    }
}