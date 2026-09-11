class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> ans = new HashSet<>();

        for(int f = 0; f<digits.length; f++){
            if(digits[f]==0){
                continue;
            }
            for(int s = 0; s<digits.length; s++){
                if(s==f){
                    continue;
                }


            

             for(int t = 0; t<digits.length; t++){

                 if(t==f || t==s){
                    continue;
                 }
                 if(digits[t]%2 !=0){
                    continue;
                 }

                 int num = digits[f]*100+digits[s]*10+ digits[t];

                 ans.add(num);
            }   }
        }



        return ans.size();
        
    }
}