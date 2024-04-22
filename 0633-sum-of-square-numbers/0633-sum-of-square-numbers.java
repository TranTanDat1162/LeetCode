class Solution {
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public boolean judgeSquareSum(int c) {
        int i = 0;
        while (!checkPerfectSquare(c - i*i) && c - i*i >= 0) {
            i++;
            if (c - i*i < 0)
                return false;
        }
        return true;
    }
}