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
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        List<Integer> ar = new ArrayList<>();

        ListNode curr = head;
        while(curr!=null){
            ar.add(curr.val);

            curr = curr.next;

        }

        Collections.sort(ar);

         ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int i = 0; i < ar.size(); i++) {
            tail.next = new ListNode(ar.get(i));
            tail = tail.next;
        }
        
        return dummy.next;
    
        
        
    }
}