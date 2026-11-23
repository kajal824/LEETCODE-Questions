class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];

        for(int a[]:dp){
            Arrays.fill(a, -1);
        }

        return solve(word1, word2, 0, 0 ,dp );
        
    }

    public int solve(String word1, String word2, int i, int j, int[][] dp){
        if(i==word1.length()){
            return word2.length()-j;
        }
        if(j==word2.length()){
            return word1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = 0;
        int ins = 0;
        int dlt = 0;
        int rep = 0;

        if(word1.charAt(i)==word2.charAt(j)){
            ans =  solve(word1, word2, i+1, j+1,dp);
        }else{
           ins =  solve(word1, word2, i, j+1, dp);

           dlt =  solve(word1, word2, i+1, j, dp);

           rep =  solve(word1, word2, i+1, j+1, dp);

           ans =  1+Math.min(ins, Math.min(dlt, rep));

           


        }
        return dp[i][j] = ans;
    }
}