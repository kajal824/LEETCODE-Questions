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
        // Edge case check: agar list khali hai ya ek hi node hai
        if (head == null || head.next == null) {
            return head;
        }

        ArrayList<ListNode> ar = new ArrayList<>();
        ListNode cr = head;

        while (cr != null) {
            ar.add(cr);
            cr = cr.next;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode ehead = even; 

        
        for (int i = 0; i < ar.size(); i += 2) {
            

            if (i + 2 < ar.size()) {
                odd.next = ar.get(i + 2); 
                odd = odd.next;           
            }
            
           
            if (i + 3 < ar.size()) {
                even.next = ar.get(i + 3); 
                even = even.next;          
            }
        }
        

        even.next = null;
        
        
        odd.next = ehead;
        
        return head;
    }
}
