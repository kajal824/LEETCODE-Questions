class Solution {
    public void reverseString(char[] s) {

        int n = s.length;

        char[] ans = new char[n];
        for(int i=n-1; i>=0; i--){

            ans[n-1-i] = s[i];



            
        }

        for(int i=0; i<n ; i++){
            s[i] = ans[i];
        }
        
    }
}