class Solution {
    public int firstUniqChar(String s) {
		int[] cache = new int[256];
		for (int i = 0; i < s.length(); i++) {
			cache[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (cache[s.charAt(i)] == 1)
				return i;
		}
		return -1;	
    }
}