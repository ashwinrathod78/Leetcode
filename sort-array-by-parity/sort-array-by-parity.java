class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int begin = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==0) {
                int temp = nums[begin];
                nums[begin++] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}