class Solution {
    public int maxProfit(int[] prices) {
        int lsf = prices[0];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=1;i<prices.length;i++) {
            sum = prices[i] - lsf;
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(prices[i] < lsf) {
                lsf = prices[i];
            }
        }
        return maxSum < 1 ? 0 : maxSum;
    }
}