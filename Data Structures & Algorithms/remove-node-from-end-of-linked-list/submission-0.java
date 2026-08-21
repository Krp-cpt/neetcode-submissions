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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int count =0;
       ListNode cur = head;
       while(cur != null){
        count ++;
        cur = cur.next;
       } 
       if(count == n){
        return head.next;
       }
       cur = head;
       ListNode prev = null;
       int i=0;
       while(i != count-n){
            prev = cur;
            cur = cur.next;
            i++;
       }
       prev.next = cur.next;
       cur.next = null;
       return head;
    }
}
