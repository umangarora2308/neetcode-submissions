class Solution {
    public boolean isPalindrome(String s) {
      char[] chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
      char[] s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int start = 0;
        int end = s1.length -1;
    

        while(start<=end){
            char temp = s1[start];
            s1[start] = s1[end];
            s1[end] = temp;
            start++;
            end--;
        }

        return Arrays.equals(s1, chars);
    }
}
