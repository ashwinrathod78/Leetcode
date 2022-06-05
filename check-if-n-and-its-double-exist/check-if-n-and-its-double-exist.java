class Solution {
    /*
    [7,1,14,11]
    [3,1,7,11]
    */
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr) {
            if(i>0 && set.contains(i*2) || i%2==0 && set.contains(i/2))
                return true;
            set.add(i);
        }
        return false;
    }
}