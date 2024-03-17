class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--)
        {
            digits[i]++;
            
            if (digits[i] == 10)
                digits[i] = 0;
            else
                return digits;
        }
        
        int[] results = new int [digits.length + 1];
        results[0] = 1;
        return results;
    }
}