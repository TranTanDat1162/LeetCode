class Solution {
    public int missingNumber(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        if (nums[nums.length - 1] == nums.length - 1)
            return nums.length;
        
        // Create hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        return map.entrySet().stream().filter(e -> e.getKey() == e.getValue() + 1)
                .map(Map.Entry::getValue).findFirst().orElseThrow();
    }
}