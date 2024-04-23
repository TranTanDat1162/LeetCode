class Solution {
    static public List<List<Integer>> generate(int numRows) {
        // Create the triangle
        List<List<Integer>> triangle = new ArrayList<>();
        IntStream.range(0, numRows).forEach(i -> {
            // Create each row in triangle
            // Each row always has the element '1' in the first
            List<Integer> row = new ArrayList<>(List.of(1));
            IntStream.range(1, i).forEach(j -> {
                Integer element = triangle.get(i - 1).get(j - 1) +  triangle.get(i - 1).get(j);
                row.add(element);
            });
            triangle.add(row);
            // Always having the element 1 in last index for each row
            // Except for the first row.
            if (i > 0) {
                row.add(1);
            }
        });
        return triangle;
    }
}