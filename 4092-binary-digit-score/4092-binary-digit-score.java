class Solution {
    public int calculateScore(int a, int b) {

        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(c=='1'){
                cnt1++;
            }
        }
        for(int i=0; i<s2.length(); i++){
            char c = s2.charAt(i);
            if(c=='1'){
                cnt2++;
            }
        }

        if(cnt1>=cnt2){
           return cnt1*cnt2;
        }

        return cnt2/cnt1;
        
    }
}