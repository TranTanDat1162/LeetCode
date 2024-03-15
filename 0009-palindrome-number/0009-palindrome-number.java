class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equals(reversedString);
    }
}