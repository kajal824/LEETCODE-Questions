class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int l=0, r=nums.length-1;

        int ls = 1;
        int rs = 1;

        int k = nums.length-1;

        while(l<=r){
            ls = nums[l]*nums[l];
            rs = nums[r]*nums[r];

            if(ls>rs){
                ans[k]= ls;
                l++;
                k--;
            }else{
                ans[k] = rs;
                r--;
                k--;
            }
        }
        return ans;
        
    }
}