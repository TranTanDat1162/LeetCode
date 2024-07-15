class Solution {
    public int romanToInt(String s) {
        // Create the hash map to store each character into number value
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Mapping data
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        // Create the result variable for storing the value of String s
        int result = 0;

        // Loop
        for (int i = 0; i < s.length(); i++) {
            // However, we calculate for case if the next character from i = 1
            // is greater than the previous one, apply the logic for calculating the result
            if (i > 0 && hashMap.get(s.charAt(i)) > hashMap.get(s.charAt(i - 1)))
                result += hashMap.get(s.charAt(i)) - 2 * hashMap.get(s.charAt(i - 1));
            else
                // Calculate the result
                result += hashMap.get(s.charAt(i));
        }

        return result;
    }
}