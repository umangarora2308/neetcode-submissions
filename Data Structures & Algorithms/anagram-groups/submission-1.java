class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sortedMap = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
                sortedMap.putIfAbsent(key,new ArrayList<>());
                sortedMap.get(key).add(s);
        }  

        return new ArrayList<>(sortedMap.values());      
    }
}
