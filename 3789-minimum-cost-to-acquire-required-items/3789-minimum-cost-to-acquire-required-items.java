class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ttc = 0;
        if ((long) cost1 + cost2 <= costBoth) {
            ttc = (long) cost1 * need1 + (long) cost2 * need2;
        } else {
            int cnt = Math.min(need1, need2);
            ttc = (long) cnt * costBoth;
            need1 -= cnt;
            need2 -= cnt;
            
            if (need1 > 0) {
                ttc += (long) need1 * Math.min(cost1, costBoth);
            } else if (need2 > 0) {
                ttc += (long) need2 * Math.min(cost2, costBoth);
            }
        }
        return ttc;
    }
}
