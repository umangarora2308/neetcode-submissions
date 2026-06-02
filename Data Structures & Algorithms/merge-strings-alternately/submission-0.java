class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1_length = word1.length();
        int word2_length = word2.length();
        int max = Math.max(word1_length, word2_length); // was Math.max(word1_length, word1_length)
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < max; i++) {
            if (i < word1_length) {
                sb.append(word1.charAt(i));
            }
            if (i < word2_length) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}