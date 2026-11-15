class Solution {
    public int countConsistent(int[] nums) {
        int cnt = 0;

        for(int i=0; i<nums.length;i++){
            int mn = nums[i];
            int and = nums[i];
            

            for(int j=i; j<nums.length;j++){
                mn = Math.min(mn,nums[j]);
                 and &= nums[j];

                 if(mn==and){
                    cnt++;
                 }

                 
            }

           
        }

         return cnt;
        
    }
}