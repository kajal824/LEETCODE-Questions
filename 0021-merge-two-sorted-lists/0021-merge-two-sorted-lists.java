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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        if (list1 == null) return list2;
        if (list2 == null) return list1; 
        
        
        ListNode ans = null; 

        
        ListNode tem1 = list1;
        ListNode tem2 = list2;
        
       
        if (tem1.val <= tem2.val) {
            ans = tem1;
            tem1 = tem1.next;
        } else {
            ans = tem2;
            tem2 = tem2.next;
        }
        
        ListNode current = ans;
        
        while (tem1 != null && tem2 != null) {
            if (tem1.val <= tem2.val) {
                current.next = tem1;
                tem1 = tem1.next;
            } else {
                current.next = tem2;
                tem2 = tem2.next;
            }
            current = current.next;
        }
        
        
        if (tem1 != null) {
            current.next = tem1;
        } else {
            current.next = tem2;
        }
        
       
        return ans;
    }
}
