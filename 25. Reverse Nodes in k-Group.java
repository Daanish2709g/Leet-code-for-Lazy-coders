/*Question: Reverse Nodes in Groups of k
You are given a linked list, and you need to reverse its nodes in groups of size k. If the remaining nodes at the end are less than k, leave them as they are (don’t reverse them).

What Does Reversing Groups Mean?
Example 1:
Input list: 1 -> 2 -> 3 -> 4 -> 5, with k = 2.

Reverse the first 2 nodes: 2 -> 1.
Reverse the next 2 nodes: 4 -> 3.
The remaining 1 node is left as it is.

*/
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Step 1: Check if there are at least k nodes left in the list
        ListNode node = head;
        int count = 0;

        // Traverse to see if we have k nodes
        while (count < k) {
            if (node == null) {
                // If there are fewer than k nodes left, return head (no reversal needed)
                return head;
            }
            node = node.next; // Move to the next node
            count++;
        }

        // Step 2: Recursively reverse the rest of the list after the first k nodes
        // 'node' now points to the start of the next group of k nodes
        ListNode pre = reverseKGroup(node, k); // Recursive call to process the next group

        // Step 3: Reverse the current k nodes
        while (count > 0) { // Reverse k nodes one by one
            ListNode next = head.next; // Save the next node
            head.next = pre;          // Reverse the current node's pointer to point to 'pre'
            pre = head;               // Move 'pre' to the current node
            head = next;              // Move 'head' to the next node
            count--;                  // Decrement the count as we process one node
        }

        // Step 4: Return the new head of the reversed group
        return pre;
    }
}
