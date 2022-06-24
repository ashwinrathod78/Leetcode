class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int length = s.length() - 1;
        while(s.charAt(length) == ' ')
            length--;
        for(int i=length;i>=0;i--) {
            if(s.charAt(i) == ' ')
                break;
            result++;
        }
        return result;
    }
}