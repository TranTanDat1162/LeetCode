class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i_index, j_index;
        for (int i = 0 ; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (target == nums[i] + nums[j])
                {
                    i_index = i;
                    j_index = j;
                    arr[0] = i_index;
                    arr[1] = j_index;
                }
            }
        }
        return arr;
    }
}