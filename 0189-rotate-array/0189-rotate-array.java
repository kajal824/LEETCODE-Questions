class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n;
        
        int j = 0;

        int[] tem = new int[n];
        for(int i = n-k; i<n; i++){
            tem[j++] = nums[i]; 
        }

        for(int i=0; i<n-k; i++){
            tem[j++] = nums[i];
        }
        for(int i=0; i<tem.length; i++){
            nums[i] = tem[i];
        }
        
    }
}