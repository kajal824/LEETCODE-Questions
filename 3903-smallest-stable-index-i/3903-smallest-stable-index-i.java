class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n =  nums.length;
        for(int i=0; i<n ; i++){
            int mx = -1;
            for(int j =0; j<=i; j++){
                mx = Math.max(mx,nums[j]);
            }
            int mn = Integer.MAX_VALUE;
            for(int j=i; j<n; j++){
                mn = Math.min(mn,nums[j]);
            }

            if(mx-mn <= k){
                return i;
            }
        } 
        return  -1;
        
    }
}