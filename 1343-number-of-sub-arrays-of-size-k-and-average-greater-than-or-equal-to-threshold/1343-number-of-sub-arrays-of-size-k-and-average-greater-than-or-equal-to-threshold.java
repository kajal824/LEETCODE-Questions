class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0;

        for (int i = 0; i <= arr.length - k; i++) {

            int sum = 0;
            int avg = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (j - i + 1 == k) {
                    avg = sum / k;
                    break;
                }
            }

            if (avg >= threshold) {
                cnt++;
            }

        }

        return cnt;

    }
}