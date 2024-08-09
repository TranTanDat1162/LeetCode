class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList();
        
        int greatestNum = Arrays.stream(candies).max().getAsInt();
        
        for (int candy : candies) {
            if (candy + extraCandies >= greatestNum) {
                results.add(true);
            }
            else {
                results.add(false);
            }
        }
        
        return results;
    }
}