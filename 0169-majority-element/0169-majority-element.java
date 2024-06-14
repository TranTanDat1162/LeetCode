class Solution {
    public int majorityElement(int[] nums) {
                HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        return hashMap.keySet().stream().max(Comparator.comparing(hashMap::get)).get().intValue();
    }
}