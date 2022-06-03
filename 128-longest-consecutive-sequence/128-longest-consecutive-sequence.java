class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int currentMax = 1;
        int max = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i])
                continue;
            if(nums[i-1] == (nums[i] - 1))
                currentMax++;
            else {
                max = Math.max(max,currentMax);
                currentMax = 1;
            }
        }
        return Math.max(max,currentMax);
    }
}