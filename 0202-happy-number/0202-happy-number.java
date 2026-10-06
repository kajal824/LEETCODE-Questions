class Solution {

    public int getsum(int n){
         int sum = 0;
        
        while(n!=0){
           
            int dig = n%10;
            sum += dig*dig;

            n/=10;
            
        }
        return sum;

    }
    public boolean isHappy(int n) {

        int f =n;
        int s = n;

        do{
            s= getsum(s);
            f = getsum(getsum(f));
        }while(s!=f);
        if(s==1){
            return true;
        }

        return false;        
        
    }



}