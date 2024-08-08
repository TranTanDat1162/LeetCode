class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return map.entrySet().stream().filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
                      .findFirst().orElseThrow();
    }
}