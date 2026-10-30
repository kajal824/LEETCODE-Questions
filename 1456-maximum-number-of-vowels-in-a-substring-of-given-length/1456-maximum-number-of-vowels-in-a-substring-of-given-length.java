class Solution { 
    public int maxVowels(String s, int k) { 
        int mx = 0;
        int cnt = 0; 
        for (int e = 0; e < s.length(); e++) { 
            char ch = s.charAt(e); 
            
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                cnt++; 
            } 
            
            if (e >= k) {
                char prevCh = s.charAt(e - k);
                if (prevCh == 'a' || prevCh == 'e' || prevCh == 'i' || prevCh == 'o' || prevCh == 'u') {
                    cnt--;
                }
            }

            
            if (e >= k - 1) { 
                mx = Math.max(mx, cnt); 
            } 
        } 
        return mx;
    } 
}
