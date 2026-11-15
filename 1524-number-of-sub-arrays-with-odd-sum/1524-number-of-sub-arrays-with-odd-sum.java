class Solution {
    public int numOfSubarrays(int[] arr) {

        int mod = 1000000007;
        int ec = 1;
        int oddc = 0;
        int res = 0;
        int pre = 0;

        for(int num: arr){

            pre+= num;
            if(pre%2==0){
                res += oddc;
                ec++;
            }else{
                res += ec;
                oddc++;
            }

            res = res%mod;

        }

        return res;
        
    }
}