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
        // Create new list node
        ListNode head = new ListNode();
        
        // Set the pointer to the tail;
        ListNode tail = head;
        
        // Iteration for list1 and list2 to add value for ListNode result
        while (list1 != null && list2 != null) {
            // Check if list note of list1 or list2 is smaller
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        // Supposing if list1 or list2 contains other list node => set the pointer of tail to this list
        tail.next = list1 != null ? list1 : list2;
        
        // Return the list node
        return head.next;
    }
}