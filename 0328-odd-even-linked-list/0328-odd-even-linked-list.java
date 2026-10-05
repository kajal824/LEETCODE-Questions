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
import java.util.ArrayList;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        
        ArrayList<ListNode> ar = new ArrayList<>();
        ListNode cr = head;
        while (cr != null) {
            ar.add(cr);
            cr = cr.next;
        }

        
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        
        ListNode odd = oddDummy;   
        ListNode even = evenDummy; 

        
        for (int i = 0; i < ar.size(); i++) {
            if (i % 2 == 0) {
                odd.next = ar.get(i); 
                odd = odd.next;       
            } else {
                
                even.next = ar.get(i); 
                even = even.next;      
            }
        }

        
        even.next = null;
        
       
        odd.next = evenDummy.next;

        
        return oddDummy.next;
    }
}
