class Solution {
    public boolean isPalindrome(String s) {
        int i =0; 
        int j =s.length()-1;

        while(i<j){

            char startChar = s.charAt(i);
            char endChar = s.charAt(j);

            
            if (!Character.isLetterOrDigit(startChar)) {
                i++;
            } 
            
            else if (!Character.isLetterOrDigit(endChar)) {
                j--;
            } 
            
            else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    return false; 
                }
                i++;
                j--;
            }
        }

        return true;
    }
}
