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
    public ListNode partition(ListNode head, int x) {

        ListNode dum = new ListNode(0);
        dum.next = head;

        
        ListNode sm = dum;
        while (sm.next != null && sm.next.val < x) {
            sm = sm.next;
        }

        
        ListNode tem2 = sm;

        while (tem2 != null && tem2.next != null) {
            if (tem2.next.val < x) {
                
                ListNode nextTarget = tem2.next;
                tem2.next = nextTarget.next; 
                
                
                nextTarget.next = sm.next;
                sm.next = nextTarget;
                
                
                sm = sm.next; 
            } else {
                tem2 = tem2.next;
            }
        }

        return dum.next;
    }
}
