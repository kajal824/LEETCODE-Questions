class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i=0;  i<nums.length; i++){
            mx = Math.max(mx, nums[i]);

            mn = Math.min(mn, nums[i]);
            
        }
        return gcd(mx,mn);
        
    }

    private int gcd(int a, int b){
        while(b!=0){
            int tm = b;
            b=a%b;
            a = tm;
        }
        return a;
    }
}