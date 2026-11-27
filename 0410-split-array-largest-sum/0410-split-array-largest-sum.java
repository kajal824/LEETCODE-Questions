class Solution {
    public int splitArray(int[] arr, int k) {
        if(arr.length<k){
            return -1 ;
        }
        long mx = 0;
        long sum = 0;
        
        for(int i=0; i<arr.length; i++){
            mx = Math.max(mx, arr[i]);
            sum += arr[i];
            
        }
        long l = mx;
        long h = sum;
        long ans = 0;
        
        
        while(l<=h){
            long mid = l+(h-l)/2;
            if(isp(arr, k, mid)){
                
                ans = mid;
                h = mid-1;
                
            }else{
                l = mid+1;
            }
            
        }
        return (int) ans;
        
    }
    
    public boolean isp(int[] arr, int k, long mid){
        
        long std = 1;
        long rp = 0;
        for(int i=0; i<arr.length; i++){
            if(rp+arr[i]<=mid){
                rp = rp+arr[i];
            }else{
                std++;
                rp =arr[i];
            }
            if(std>k){
                return false;
            }
        }
        
        return true;
        
    }
}