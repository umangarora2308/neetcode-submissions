class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> ls = new ArrayList<>();
            for(int i =0; i<nums.length; i++){
                if(nums[i]!=val){
                   ls.add(nums[i]);
                } 
            }
            for(int j =0;j<ls.size();j++){
                nums[j]=ls.get(j);
            }
        return ls.size();
    }
}