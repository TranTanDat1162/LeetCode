class Solution {
    public static int majorityElement(int[] nums) {
        // Create the hash map for storing num of appear of elements (key)
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num: nums)
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

        // Return the key having the max value
        return hashMap.keySet().stream().max(Comparator.comparing(hashMap::get)).orElse(0);
    }
}