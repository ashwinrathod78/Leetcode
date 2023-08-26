class Solution {

    public int[] productExceptSelf(int[] nums) {
        //int[] resultArray = new int[nums.length];
        int productOfArray = 1;
        int zeroCount = 0;
        int zeroLoc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroLoc = i;
                continue;
            }
            productOfArray *= nums[i];
        }
        if (zeroCount > 1) {
            Arrays.fill(nums, 0);
        } else if (zeroCount == 1) {
            Arrays.fill(nums, 0);
            nums[zeroLoc] = productOfArray;
        } else {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = productOfArray / nums[i];
            }
        }
        return nums;
    }
}
