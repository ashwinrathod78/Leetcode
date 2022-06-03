class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 9 && nums[i] < 100 )
                result++;
            else if(nums[i] > 999 && nums[i] <10000 )
                result++;
            else if(nums[i] > 99999 && nums[i] <1000000 )
                result++;
        }
        return result;
    }
}