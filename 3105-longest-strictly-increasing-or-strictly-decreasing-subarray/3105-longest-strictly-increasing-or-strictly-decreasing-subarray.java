class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int mx = 1;

        for (int i = 0; i < nums.length; i++) {
            int cnt1 = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[j - 1]) {
                    cnt1++;
                } else {
                    break;
                }
            }

            int cnt2 = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    cnt2++;
                } else {
                    break;
                }
            }

            mx = Math.max(mx, Math.max(cnt1, cnt2));
        }

        return mx;
    }
}
