class Solution {
    public int minMoves(int[] nums) {

        int mx = Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++){

            mx = Math.max(mx, nums[i]);



        }
        int ans = 0;

        for(int i =0; i<nums.length; i++){
            ans += (mx-nums[i]);
        }

        return ans;
        
    }
}