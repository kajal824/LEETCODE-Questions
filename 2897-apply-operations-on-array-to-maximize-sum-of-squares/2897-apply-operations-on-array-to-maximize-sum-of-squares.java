class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long MOD = 1_000_000_007L;
        int[] bitCounts = new int[31];
        
        for (int num : nums) {
            for (int i = 0; i < 31; i++) {
                if (((num >> i) & 1) == 1) {
                    bitCounts[i]++;
                }
            }
        }
        
        long totalSumOfSquares = 0;
        
        for (int step = 0; step < k; step++) {
            long currentNum = 0;
            for (int i = 0; i < 31; i++) {
                if (bitCounts[i] > 0) {
                    currentNum |= (1L << i);
                    bitCounts[i]--;
                }
            }
            long square = (currentNum * currentNum) % MOD;
            totalSumOfSquares = (totalSumOfSquares + square) % MOD;
        }
        
        return (int) totalSumOfSquares;
    }
}
