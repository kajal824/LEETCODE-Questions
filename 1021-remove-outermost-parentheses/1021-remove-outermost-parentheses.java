class Solution {
    public String removeOuterParentheses(String s) {

        int op = 0;

        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                if(op>0){
                    res.append(ch);
                }

                op++;
            }else{
                op--;
                if(op>0){
                    res.append(ch);
                }
            }

        }

        return res.toString();
        
    }
}