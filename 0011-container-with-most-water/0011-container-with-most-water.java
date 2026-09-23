class Solution {
    public int maxArea(int[] height) {
        
        int i =0;; 
        int j = height.length-1;
        int mx = 0;

        while(i<j){
            int h = Math.min(height[i], height[j]);

            int wid = j-i;
            mx =Math.max(mx, h*wid);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }

        }
        return mx;
    }
}