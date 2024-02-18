class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int [2];
        int i_index = 0;
        int j_index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    i_index = i;
                    j_index = j;
                    result[0] = i_index;
                    result[1] = j_index;
                    return result;
                }
            }
        }
        return new int[0];
    }
}