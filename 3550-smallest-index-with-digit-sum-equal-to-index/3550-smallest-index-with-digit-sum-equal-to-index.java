class Solution {
    public int smallestIndex(int[] nums) {

        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            int d = nums[i];
            if (d == 0) {
                sum = 0;
            } else {
                while (d != 0) {
                    int dig = d % 10;
                    sum += dig;
                    d /= 10;

                }
            }
            if (i == sum) {
                mn = Math.min(mn, i);

                return mn;
            }
                
            

            

        }

        return -1;

    }
}