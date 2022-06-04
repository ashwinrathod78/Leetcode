class Solution {
    public void duplicateZeros(int[] arr) {
       int left = 0, right=0;
        for(;left < arr.length;left++) if(arr[left]==0) right++;
        left=arr.length-1;
        right = arr.length + right - 1;
        while(left >= 0 && right >=0) {
            if(arr[left]!=0) {
                if(right < arr.length)
                    arr[right] = arr[left];
            } else {
                if(right < arr.length)  arr[right] = arr[left];
                    right--;
                if(right < arr.length)  arr[right] = arr[left];
            }
            left --;
            right --;
        }
        /* for(int i=1;i<arr.length;i++){
            if(arr[i-1]==0) {
                for(int j=arr.length-1;j>i;j--) {
                    arr[j] = arr[j-1];
                }
                arr[i++]=0;
            }
        }
        */
    }
}