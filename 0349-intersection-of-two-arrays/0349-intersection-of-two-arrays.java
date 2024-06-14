class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        return Arrays.stream(nums2).boxed().filter(list::contains).distinct().mapToInt(i -> i).toArray();
    }
}