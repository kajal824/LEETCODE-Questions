class Solution {
    
    public String maxSumOfSquares(int num, int sum) {
        
        if (sum > (long) num * 9) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int n = sum / 9;
        int rem = sum % 9;

        for (int i = 0; i < n; i++) {
            sb.append('9');
        }

        if (rem > 0) {
            sb.append(rem);
        }

        while (sb.length() < num) {
            sb.append('0');
        }

        return sb.toString();
    }
}
