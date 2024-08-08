/*
    n = 1 => 1
    n = 2 => 2
    n = 3 => 3
    n = 4 => 5
    n = 5 => 8
    => 1 2 3 5 8 13 21 34 (fibonanci)
*/
class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}