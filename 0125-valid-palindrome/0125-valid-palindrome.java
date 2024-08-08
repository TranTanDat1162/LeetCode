class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        String result = sb.toString();
        String reversedString = sb.reverse().toString();
        return reversedString.equals(result);
    }
}