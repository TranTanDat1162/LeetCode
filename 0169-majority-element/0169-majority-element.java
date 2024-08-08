class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return map.entrySet().stream().max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey).orElseThrow();
    }
}