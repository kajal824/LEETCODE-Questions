class Solution {
    public boolean checkString(String s) {
        boolean ist = false;
        int ans = -1;
        int ans2 = s.length();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                ans = i;
            } else if (ans2 == s.length()) {
                ans2 = i;
            }

        }

        if (ans < ans2) {
            ist = true;
        }

        if (ist) {
            return true;
        }
        return false;

    }
}