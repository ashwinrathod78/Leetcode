class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] cache = new int[26];
        for(int i=0;i<s.length();i++) {
            cache[s.charAt(i)-'a']++;
            cache[t.charAt(i)-'a']--;
        }
        for(char c : s.toCharArray()) {
            if(cache[c-'a'] > 0)
                return false;
        }
        return true;  
    }
}