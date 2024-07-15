class Solution {
    public boolean isPalindrome(int x) {
        // Create StringBuilder instance
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        // Call function reverse from StringBuilder to reverse String x
        sb.reverse();

        // Return for checking whether reversed string is the same as string x
        return String.valueOf(x).contentEquals(sb);
        
        /**
            Please note that using contentEquals for StringBuilder or StringBuffer        
         */
    }
}