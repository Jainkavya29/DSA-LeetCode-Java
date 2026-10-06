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
    public ListNode reverseLinkedList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newNode = reverseLinkedList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        // 1. Find the middle of the linked list using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2. Reverse the second half of the linked list
        ListNode newHead = reverseLinkedList(slow.next);
        // 3. Compare the first half and the reversed second half
        ListNode first = head;
        ListNode second = newHead;
        boolean result = true;
        while(second != null){
            if(first.val != second.val){
                result = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        return result;
    }
        
}