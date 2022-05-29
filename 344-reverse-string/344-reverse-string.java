class Solution {
    public void reverseString(char[] s) {
         char t = ' ';
        for(int i=0,j=s.length-1;i<j;i++,j--) {
            t = s[i];
            s[i]=s[j];
            s[j]=t;
        }
    }
}