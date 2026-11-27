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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy;

        while(tail != null){
            ListNode curr = tail;
            while(tail.next != null && tail.next.val == val){
                tail = tail.next;
            }

            curr.next = tail.next;
            tail = curr.next;
        }
        return dummy.next;
        
    }
}