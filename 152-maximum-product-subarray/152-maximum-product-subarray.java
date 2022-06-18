class Solution {
    public int maxProduct(int[] nums) {
        int max=0,min=0,res=nums[0];
        if(nums.length == 1)
            return res;
        for(int i=0;i<nums.length;i++) {
            max = (max == 0 ? 1 : max ) * nums[i];
            min = (min == 0 ? 1 : min ) * nums[nums.length - 1 - i]; // if all negative, [-1,-2,-3] = max is -3 * -2 = 6
            res = Math.max(res, Math.max(max,min));
        }
        return res;
    }
}