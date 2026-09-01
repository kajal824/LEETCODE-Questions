class Solution {
        public int countSpecialIntegers(int[] nums) {
        int[] cnt = new int[101];
        int res = 0, n = nums.length;
        for (int i = 0; i < nums.length; i++)
            if (i == 0 || nums[i] != nums[i - 1])
                cnt[nums[i]]++;
        for (int c : cnt)
            if (c == 1)
                res++;
        return res;
    }
    
}