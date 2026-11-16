class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder st = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for (int j = i; j < s.length(); j++) {
                    char ch = s.charAt(j);
                    sum += ch - '0';

                    if (j - i + 1 == k) {
                        break;
                    }
                }
                st.append(sum);
            }

            s = st.toString();
        }
        return s;
    }
}
