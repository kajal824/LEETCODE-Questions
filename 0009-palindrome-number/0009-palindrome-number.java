class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        int n = x;
        int rem =0;

        while(n!=0){
            int dig = n%10;
            rem = (rem)*10+dig;

            n/=10;
        }

        if(rem!=x){
            return false;

        }
        return true;
        
    }
}