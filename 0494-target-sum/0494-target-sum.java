class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return solve(nums, target, 0, 0);

    }

    public int solve(int[] nums, int target, int i, int sum) {
        if (i == nums.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int p = solve(nums, target, i + 1, sum + nums[i]);
        int m = solve(nums, target, i + 1, sum - nums[i]);

        return p + m;
    }

}