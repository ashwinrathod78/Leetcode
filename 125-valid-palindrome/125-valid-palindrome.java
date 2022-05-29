class Solution {

    public boolean isPalindrome(String s) {
         s = s.toLowerCase(); 
        char[] c = s.toCharArray();

        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (c[i++] != c[j--]) 
                return false;
        }
        return true;
    }
}
