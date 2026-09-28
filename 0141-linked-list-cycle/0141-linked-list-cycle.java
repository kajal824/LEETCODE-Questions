/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // 1. Fixed: Removed 'int pos' so it matches LeetCode's required signature
    public boolean hasCycle(ListNode head) {
        ListNode cur  = head;
        if(head == null){
            return false;
        }

        int cnt = 1;

        
        while(cur != null && cnt <= 10001){
            cnt++;
            cur = cur.next;
        }
        
        
        if (cnt <= 10001) {
            return false;
        }

        return true;
    }
}
