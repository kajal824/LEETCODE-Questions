/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;

        List<Integer> ar = new ArrayList<>();

        while (curr != null) {
            ListNode cn = curr.next;
            int lar = 0;
            while (cn != null) {
                if (curr.val < cn.val) {

                    lar = cn.val;

                    break;

                } 

                cn = cn.next;

                
            }

            ar.add(lar);
            curr = curr.next;

            
        }

        int[] ans = new int[ar.size()];

        int id = 0;

        for (int i = 0; i < ar.size(); i++) {
            ans[id++] = ar.get(i);
        }

        return ans;

    }
}