class Solution {
    public int[] plusOne(int[] digits) {
        // Handle the case there is no number to store
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            
            if (digits[i] == 10)
                digits[i] = 0;
            else
                return digits;
        }
        
        // Handle the case there is number to store // 9999 => 10000
        int[] results = new int[digits.length + 1];
        results[0] = 1;
        return results;
    }
}