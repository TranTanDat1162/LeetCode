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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a new list node form the sum of the two numbers
        ListNode listNodeSum = new ListNode();

        // Create a pointer to the list node for every update
        ListNode ListNodeCurrent = listNodeSum;

        // Create a carry variable for the sum for case if the sum is greater than 10
        int carry = 0;

        // Loop until one of the lists is empty
        while (l1 != null || l2 != null) {
            // Create val1 and val2 variables to store the values of the current nodes
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            // Calculate the sum
            int sum = val1 + val2 + carry;

            // Update the carry
            carry = sum / 10;

            // Update the sum
            ListNodeCurrent.next = new ListNode(sum % 10);

            // This LOC will update the list node sum based on pointer
            ListNodeCurrent = ListNodeCurrent.next;

            // Move to the next node
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            // Check if the carry is greater than 0 and add it to the list node
            if (carry > 0) {
                ListNodeCurrent.next = new ListNode(carry);
            }
        }

        // Return the list node
        return listNodeSum.next;
    }
}