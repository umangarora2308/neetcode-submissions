class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        char[] arr = s.toCharArray();

        for(int i =0;i<arr.length;i++){
            if(arr[i]=='(' ||arr[i]=='{'||arr[i]=='['){
            st.push(arr[i]);
            }else{
                if(st.empty()) return false;
            char ch = st.peek();
            st.pop();
                if(arr[i] == ')' && ch != '(') return false;

                if(arr[i] == '}' && ch != '{') return false;

                if(arr[i] == ']' && ch != '[') return false;
            }
        }

        return st.empty();
    }
}
