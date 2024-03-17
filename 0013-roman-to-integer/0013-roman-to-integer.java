class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> charToInt = new HashMap<>();
        
        charToInt.put('I', 1);
        charToInt.put('V', 5);
        charToInt.put('X', 10);
        charToInt.put('L', 50);
        charToInt.put('C', 100);
        charToInt.put('D', 500);
        charToInt.put('M', 1000);
        
        int result = 0;
        int preValue = 0;
        
        for (char c : s.toCharArray())
        {
            int currentValue = charToInt.get(c);
            if (preValue < currentValue)
            {
                result += currentValue - 2 * preValue;
            }
            else
            {
                result += currentValue;
            }
            
            preValue = currentValue;
        }
        
        return result;
    }
}