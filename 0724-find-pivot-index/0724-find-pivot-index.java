class Solution {
    public int pivotIndex(int[] nums) {
        int ttl = 0;
        for (int i = 0; i < nums.length; i++) {
            ttl += nums[i];

        }
        int ls = 0;

        for (int i = 0; i < nums.length; i++) {

        
            

           int rs = ttl - ls - nums[i];

            if (ls == rs) {
                return i;
            }

            ls += nums[i];
        }

        return -1;

    }
}