class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map for storing value as loop number
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Check if hashMap contains the key for target - nums[i]
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] {hashMap.get(target - nums[i]), i};
            }

            // Mapping elements in nums array into varible i loop
            hashMap.put(nums[i], i);
        }

        // If there is no any sum of two numbers for target, return {-1, -1} or throw something error
        return new int[] {-1, -1};
    }
}