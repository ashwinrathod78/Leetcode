class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences) {
            String[] wordArray = s.split(" ");
            max = wordArray.length > max ? wordArray.length: max; 
        }
        return max;
    }
}