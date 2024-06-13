class Solution {
    public static int missingNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
            if (hashMap.containsKey(hashMap.get(nums[i]) + 1)) {
                return i;
            }
            if (i == nums.length - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}