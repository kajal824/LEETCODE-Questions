class Solution {
    
    public int numDistinct(String s, String t) {

        int[][] dp = new int[s.length()][t.length()];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }

        return solve(s,t,0, 0, dp);
        
    }


    public int solve(String s, String t, int i, int j , int[][] dp){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length() && j!= t.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int take = 0;
        int ntk = 0;
         
        if(s.charAt(i)==t.charAt(j)){
            take= solve(s,t,i+1, j+1, dp);

            ntk = solve(s,t, i+1, j, dp);
        }else{
           ntk =  solve(s,t,i+1, j, dp);
        }
        return dp[i][j]= take+ntk;
        

    }
}