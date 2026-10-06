class Solution {
    public int minAddToMakeValid(String s) {
        int c = 0;
        int p =0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                c++;
            }else if(c>0){
                c--;
            }else{
                p++;
            }
        }

        return c+p;
        
    }
}