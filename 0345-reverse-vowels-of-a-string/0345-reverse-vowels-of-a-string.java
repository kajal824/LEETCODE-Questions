class Solution {
    public String reverseVowels(String s) {
        
        char[] chars = s.toCharArray();
        
        
        StringBuilder vowels = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I') {
                vowels.append(ch); 
            }
        }
        
        
        int vowelIndex = vowels.length() - 1;
        
       
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I') {
                chars[i] = vowels.charAt(vowelIndex); 
                vowelIndex--; 
            }
        }
        
        
        return new String(chars);
    }
}
