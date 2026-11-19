

class Solution {
    public int minimizeSum(int[] nums) {
        int len = nums.length;
        
        if (len <= 3) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int x = nums[len - 1] - nums[2];
        int y = nums[len - 3] - nums[0];
        int z = nums[len - 2] - nums[1];
        
        int ans = x;
        
        if (y < ans) {
            ans = y;
        }
        
        if (z < ans) {
            ans = z;
        }
        
        return ans;
    }
}
