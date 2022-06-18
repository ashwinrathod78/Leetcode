class Solution {
   // Input: strs = ["eat","tea","tan","ate","nat","bat"]
   // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] chars = new char[26]; 
            for(char c:s.toCharArray()) chars[c-'a']++;
            String input = String.valueOf(chars);
            if(!map.containsKey(input)) {
                map.put(input,new ArrayList<>());
            }
            map.get(input).add(s);
        }
       return new ArrayList<>(map.values());    
    }
}