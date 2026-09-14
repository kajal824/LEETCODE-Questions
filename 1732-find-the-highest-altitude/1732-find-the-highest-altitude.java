class Solution {
    public int largestAltitude(int[] gain) {

        int sm = 0;
        int mx = 0;

        for(int i=0; i<gain.length; i++){
            sm += gain[i];

            mx = Math.max(mx, sm);
        }

        return mx;
        
    }
}