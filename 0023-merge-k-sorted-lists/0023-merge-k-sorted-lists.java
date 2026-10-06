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
    public ListNode merge(ListNode List1, ListNode List2){
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;
        while(List1 != null && List2 != null){
            if(List1.val < List2.val){
                res.next = List1;
                res = List1;
                List1 = List1.next;
            }
            else {
                res.next= List2;
                res = List2;
                List2 = List2.next;
            }
            res.next = null;
        }
        if(List1!= null){
            res.next = List1;
        }
        else{
            res.next = List2;
        }
        
        return dummyNode.next;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        ListNode head = lists[0];
        for(int i = 1; i< lists.length; i++){
            head = merge(head, lists[i]);
        }
        return head;
    }
}
        