class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by one
            digits[i]++;
            
            // If the current digit becomes 10, set it to 0 and continue the iteration
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // If the current digit does not become 10, return the array
                return digits;
            }
        }
        
        // If the leftmost digit becomes 10, add an extra digit with value 1 at the beginning of the array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
