class Solution {

    public void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int length = nums.length;
            int i = 0;
            for (; i < length; i++) {
                if (nums[i] == 0) {
                    break;
                }
            }
            if (i < length) {
                for (int j = i + 1; j < length; j++) {
                    if (nums[j] != 0) {
                        nums[i++] = nums[j];
                        nums[j] = 0;
                    }
                }
            }
        }
    }
}
