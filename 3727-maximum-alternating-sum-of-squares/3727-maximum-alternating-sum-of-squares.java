class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];

        }

        Arrays.sort(nums);
        long sum = 0;
        

        int l = 0;
        int r = nums.length-1;

        for(int i=0; i<nums.length; i++){

            if(i%2==0){
                sum += nums[r];
                r--;

            }else{
                sum  -= nums[l];
                l++;
            }

        }

        return sum;

        
    }
}