class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int dul = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){

                dul = nums[i];

            
            }
        }
        return dul;


     
        
    }
}