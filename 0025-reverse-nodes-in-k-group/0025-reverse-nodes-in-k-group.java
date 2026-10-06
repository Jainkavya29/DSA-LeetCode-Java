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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Step 1: Find the total length of the linked list
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Step 2: Initialize dummy node and pointers
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (length >= k) {
            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = groupStart;
            
            // Advance k times to find the start of the next group
            for (int i = 0; i < k; i++) {
                nextGroupStart = nextGroupStart.next;
            }

            // Reverse k nodes in the current group
            ListNode prev = nextGroupStart;
            curr = groupStart;
            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            // Connect the reversed group with the previous part
            prevGroupEnd.next = prev;
            prevGroupEnd = groupStart;
            length -= k;
        }

        return dummy.next;
    }
}