class Solution {
    public int missingNumber(int[] nums) {
        
        for(int i=0; i<=nums.length; i++){
            boolean fnd = false;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==i){
                    fnd = true;

                    break;
                    
                }
            }

           if(!fnd){
            return i;
           }
            
        }
        return -1;
      
        
        
    }
}