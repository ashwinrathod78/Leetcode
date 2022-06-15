class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroIndex = 0;
        int totalProduct = 1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                zeroIndex++;
                continue;
            }
            totalProduct *= nums[i];
        }
        
        for(int i=0;i<nums.length;i++) {
            if(zeroIndex > 1)
                nums[i] = 0;
            else if(nums[i] == 0)
                nums[i] = totalProduct;
            else if(zeroIndex == 1)
                nums[i] = 0; 
            else
                nums[i] = totalProduct / nums[i];
        }
        return nums;
    }
}