class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];

        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return solve(amount, coins, 0, dp);
        
    }

  public int  solve(int amount, int[] coins, int i, int[][] dp){
    if(i==coins.length){
        return 0;
        
    }
    if(amount==0){
        return 1;
    }
    if(dp[i][amount]!=-1){
        return dp[i][amount];
    }
    int inc = 0;
    int exc = 0;
      if(coins[i]<=amount){
       inc =  solve(amount-coins[i], coins, i, dp);
       

      }
      exc = solve(amount, coins, i+1, dp);

      return dp[i][amount]=  inc+exc;

    }
}