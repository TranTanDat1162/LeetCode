class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        return Arrays.stream(nums2).distinct().filter(list::contains).toArray();
    }
}