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
    public void reorderList(ListNode head) {
         ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next;
        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        slow = head;
        ListNode cur = head.next;
        while(cur != null && prev != null){
            ListNode n = prev.next;
            slow.next = prev;
            prev.next = cur;
            slow = cur;
            cur = cur.next;
            prev = n;
        }
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
