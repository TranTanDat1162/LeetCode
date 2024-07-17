class Solution {
    public boolean containsDuplicate(int[] nums) {
                int[] listDistinct = Arrays.stream(nums).distinct().toArray();
        return !Arrays.equals(nums, listDistinct);
    }
}