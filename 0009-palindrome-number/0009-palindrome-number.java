class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reversedString = new StringBuilder(s).reverse().toString();
        return reversedString.equals(s);
    }
}