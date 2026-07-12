/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to serve as the start of our new list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        // Keep looping if there are nodes left in l1, l2, OR a leftover carry
        while (l1 != null || l2 != null || carry != 0) {
            
            // Get the values from the current nodes (use 0 if the list has ended)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Calculate the total sum and the new carry
            int total = val1 + val2 + carry;
            carry = total / 10; // e.g., 18 / 10 = 1
            
            // Create a new node with the digit part of the total
            current.next = new ListNode(total % 10); // e.g., 18 % 10 = 8
            
            // Move the current pointer forward in our new list
            current = current.next;
            
            // Move l1 and l2 forward if they still have nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // Return the actual head of the new list (skipping the dummy node)
        return dummy.next;
    }
}