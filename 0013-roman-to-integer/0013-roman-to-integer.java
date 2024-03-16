class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('V', 5);
        characterIntegerMap.put('X', 10);
        characterIntegerMap.put('L', 50);
        characterIntegerMap.put('C', 100);
        characterIntegerMap.put('D', 500);
        characterIntegerMap.put('M', 1000);
        
        int result = 0;
        int preValue = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            int currentValue = characterIntegerMap.get(s.charAt(i));
            if (currentValue > preValue)
                result += currentValue - 2 * preValue;
            else 
                result += currentValue;
            preValue = currentValue;
        }
        return result;
    }
}