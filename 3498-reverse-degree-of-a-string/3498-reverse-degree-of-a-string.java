class Solution {
    public int reverseDegree(String s) {

        int sum = 0;
        int prd = 1;

        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);

           prd =26-(ch-'a');

           sum += prd*(i+1);

    
        }

        return sum;
        
    }
}