class Solution {
    public int minChanges(String s) {

        char ch = s.charAt(0);

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                cnt++;
            } else {

                if (cnt % 2 == 0) {

                    cnt = 1;

                } else {
                    ans++;

                    cnt = 0;
                }
            }

            ch = s.charAt(i);

        }

        return ans;

    }

}