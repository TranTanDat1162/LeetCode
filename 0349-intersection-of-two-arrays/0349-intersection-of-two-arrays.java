class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // convert arr2 to Set for later quick O(1) lookup
        Set<Integer> set2 = Arrays
                .stream(nums2) // Turn arr2 into IntStream
                .boxed() // boxed() converts IntStream to Stream<Integer>
                         // this is needed because Set can only hold objects
                .collect(Collectors.toSet()); // Collect all incoming Integer objects into a Set (HashSet<Integer>)

        // filter arr1 elements that exist in the set2 (arr2)
        Set<Integer> duplicates = Arrays.stream(nums1) // Turn arr1 into IntStream
                .boxed() // boxed() converts IntStream to Stream<Integer>
                         // this is needed because set2::contains expects an Integer object
                .filter(set2::contains) // Filter out all elements that are not in set2 (*)
                .collect(Collectors.toSet()); // Collect all incoming Integer objects into a Set (HashSet<Integer>) for
                                              // final results

        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }
}