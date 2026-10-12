class NumArray {
   
    private int[] pre;

    public NumArray(int[] nums) {
    
        if (nums == null || nums.length == 0) {
            this.pre = new int[0];
            return;
        }

        this.pre = new int[nums.length];
        this.pre[0] = nums[0];
        
        
        for (int i = 1; i < nums.length; i++) {
            this.pre[i] = this.pre[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        
        if (left == 0) {

            return pre[right];
        } else {
            return pre[right] - pre[left - 1];
        }
    }
}
