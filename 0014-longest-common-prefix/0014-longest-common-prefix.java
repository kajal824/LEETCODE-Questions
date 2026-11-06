class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                int k = 0;
                while (k < prefix.length() && k < strs[j].length() && prefix.charAt(k) == strs[j].charAt(k)) {
                    k++;
                }
                
                prefix = prefix.substring(0, k);
                
                if (prefix.equals("")) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
