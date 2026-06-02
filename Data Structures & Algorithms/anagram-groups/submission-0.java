class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sortedMap = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted= new String(charArray);
                sortedMap.putIfAbsent(sorted,new ArrayList<>());
                sortedMap.get(sorted).add(s);
        }  

        return new ArrayList<>(sortedMap.values());      
    }
}
