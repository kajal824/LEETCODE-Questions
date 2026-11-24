class Solution {
    public int longestPalindromeSubseq(String s) {

        int[][] dp = new int[s.length()+1][s.length()+1];

        for(int[] a: dp ){
            Arrays.fill(a, -1);
        }

       return  solve(s, 0, s.length()-1, dp);
        
    }

    public int solve(String s, int i, int j , int[][]dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }


        int ans = 0;
        if(s.charAt(i)==s.charAt(j)){
           return ans = 2+ solve(s, i+1, j-1, dp);
        }

        int isp = solve(s, i+1, j,dp);
        int nsp = solve(s, i, j-1,dp);

       return dp[i][j] =  Math.max(isp, nsp);
    }
}