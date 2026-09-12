class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
        StringBuilder sb = new StringBuilder(magazine);
        
        
        for (int i = 0; i < ransomNote.length(); i++) {
            boolean foundMatch = false;

            for (int j = 0; j < sb.length(); j++) {
                if (ransomNote.charAt(i) == sb.charAt(j)) {
                    
                    sb.setCharAt(j, '*');
                    foundMatch = true;
                    break; 
                }
            }
            
            
            if (!foundMatch) {
                return false;
            }
        }
        
        
        return true;
    }
}
