class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create the list distinct
        int[] listDistinct = Arrays.stream(nums).distinct().toArray();

        // Check if list num is not the same as listDistinct
        return !Arrays.equals(nums, listDistinct);
    }
}