class Solution { 
    public double findMaxAverage(int[] nums, int k) {
        double mx = -Double.MAX_VALUE; 
        
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0; 
            
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                
                if (j - i + 1 == k) {
                    double avg = (double) sum / k; 
                    mx = Math.max(mx, avg);
                    break; 
                }
            }
        }
        return mx;
    } 
}