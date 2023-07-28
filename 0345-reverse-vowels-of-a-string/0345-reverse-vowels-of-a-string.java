class Solution {

    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] sArray = s.toCharArray();
        while (i < j) {
            boolean firstVowel = isVowels(sArray[i]);
            boolean secondVowel = isVowels(sArray[j]);
            if (firstVowel && secondVowel) {
                char t = sArray[i];
                sArray[i] = sArray[j];
                sArray[j] = t;
                i++;
                j--;
            } else if (firstVowel) {
                j--;
            } else if (secondVowel) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(sArray);
    }

    private static boolean isVowels(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') return true; else return false;
    }
}
