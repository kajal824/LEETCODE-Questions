class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] freq = new int[nums.length + 1];
        
        int mis = -1;
        int dup = -1;

        
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++; 
        }

       
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) {
                mis = i;
            } else if (freq[i] == 2) {
                dup = i;
            }
        }

        return new int[] {dup, mis};
    }
}
