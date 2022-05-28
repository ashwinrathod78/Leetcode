class Solution {
    public int findSpecialInteger(int[] arr) {
        int result = 0;
        if(arr.length < 4)
            return arr[0];
        int expectedCount = arr.length/4;
        int currentCount = 1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1] == arr[i]) {
                currentCount++;
            } else {
                currentCount=1;
            }
            if(currentCount > expectedCount) {
                result = arr[i];
                break;
            }
        }
        
        return result;
    }
}