class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        // Put symbol into value roman
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        // Declare the sum for adding value for every single character in string s
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && hashMap.get(s.charAt(i)) > hashMap.get(s.charAt(i - 1)))
                sum += hashMap.get(s.charAt(i)) - hashMap.get(s.charAt(i - 1)) * 2;
            else
                sum += hashMap.get(s.charAt(i));
        }       
        
        return sum;
    }
}