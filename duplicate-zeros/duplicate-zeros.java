class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==0) {
                for(int j=arr.length-1;j>i;j--) {
                    arr[j] = arr[j-1];
                }
                arr[i++]=0;
            }
        }
    }
}