import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length == 0)
            return Collections.emptyList();;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            int j = i+1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0)
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if(sum > 0) {
                    k--;
                } else if(sum<0){
                    j++;
                }
            }  
        }
        return new ArrayList<>(set);  
    }
}