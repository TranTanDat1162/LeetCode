class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mapCharacterString = new HashMap<>();
        mapCharacterString.put('I', 1);
        mapCharacterString.put('V', 5);
        mapCharacterString.put('X', 10);
        mapCharacterString.put('L', 50);
        mapCharacterString.put('C', 100);
        mapCharacterString.put('D', 500);
        mapCharacterString.put('M', 1000);
        
        int result = 0;
        int preValue = 0;
        
        for (char c : s.toCharArray())
        {
            int currentValue = mapCharacterString.get(c);
            if (currentValue > preValue)
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