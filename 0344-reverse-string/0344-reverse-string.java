class Solution {
    public void reverseString(char[] s) {

        int l = 0;

        int r = s.length-1;

        while(l<r){
            swap(s,l,r);
            l++;
            r--;
        }

        
        
    }
    public void swap( char[] s, int a, int b){
            char tem = s[a];
            s[a]=s[b];
            s[b]=tem;
        }
}