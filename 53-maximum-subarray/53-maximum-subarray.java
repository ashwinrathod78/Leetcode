class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            cur_sum = Math.max(cur_sum + nums[i], nums[i]);
            max_sum = Math.max(max_sum, cur_sum);
        }
        return max_sum;
    }
}