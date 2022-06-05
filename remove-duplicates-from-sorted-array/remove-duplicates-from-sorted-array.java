class Solution {
    /*
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        int begin = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[begin] != nums[i])
                nums[++begin] = nums[i];
        }
        return ++begin;
    }
}