class Solution {
    public int[] maxProductPair(int[] nums, int target) {

        int[] ans = new int[] { -1, -1 };
        int mx = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] + nums[j] == target) {

                    if (nums[i] > nums[j]) {
                        int prd = nums[i] * nums[j];

                        if (prd > mx || !found) {
                            mx = prd;
                            ans[0] = i;
                            ans[1] = j;
                            found = true;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
