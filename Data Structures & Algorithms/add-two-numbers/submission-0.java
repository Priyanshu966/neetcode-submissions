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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(l1 != null && l2 != null){
            ListNode newNode = new ListNode();
            int sum = l1.val + l2.val + carry;
            carry = 0;
            if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            }
            newNode.val = sum;
            tail.next = newNode;
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            ListNode newNode = new ListNode();
            int sum = l1.val + carry;
            carry = 0;
             if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            }
            newNode.val = sum;
            tail.next = newNode;
            tail = tail.next;
            l1 = l1.next;

        }

        while(l2 != null){
            ListNode newNode = new ListNode();
            int sum = l2.val + carry;
            carry = 0;
             if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            }
            newNode.val = sum;
            tail.next = newNode;
            tail = tail.next;
            l2 = l2.next;

        }

        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            tail.next = newNode;

        }

        return dummy.next;
        
    }
}
