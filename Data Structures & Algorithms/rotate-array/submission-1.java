class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
    
        k = k % nums.length;


        swap(nums,0,n-1);
        swap(nums,k,n-1);
        swap(nums,0,k-1);
        
    
        }

        public void swap(int[] arr,int start, int end){
            while(start<=end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start ++;
                end--;
            }
        }
    }
