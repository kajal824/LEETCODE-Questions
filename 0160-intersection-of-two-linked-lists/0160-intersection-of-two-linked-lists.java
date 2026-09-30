/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution { 
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) { 
        ListNode tem1 = headA; 
        ListNode tem2 = headB; 
        
        
        while (tem1 != null || tem2 != null) { 
            if (tem1 == tem2) {  
                return tem1; 
            }
            
            
            tem1 = (tem1 == null) ? headB : tem1.next;
            tem2 = (tem2 == null) ? headA : tem2.next;
            
             
            if (tem1 == null && tem2 == null) {
                break;
            }
        } 
        return null; 
    } 
}
