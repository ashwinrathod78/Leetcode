class Solution {
    public int climbStairs(int n) {
        int f1=1;
        int f2=1;
        int result = f1 + f2;
        if(n <= 3)
            return n;
        for(int i =2;i<n;i++) {
            f1=f2;
            f2 = result;
            result = f1 + f2;
        }
        return result;
    }
}