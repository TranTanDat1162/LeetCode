class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] >= target)
            {
                return i;
            }
            else
            {
                if (i == nums.length - 1)
                {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}