// Given a singly linked list, delete middle of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.
// If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
// If the input linked list is NULL or has 1 node, then it should return NULL

// Example 1:

// Input:
// LinkedList: 1->2->3->4->5
// Output: 1 2 4 5
// Example 2:

// Input:
// LinkedList: 2->4->6->7->5->1

// Output: 2 4 6 5 1
// Your Task:
// The task is to complete the function deleteMid() which should delete the middle element from the linked list and return the head of the modified linked list. If the linked list is empty then it should return NULL.

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 <= N <= 1000
// 1 <= value <= 1000


class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node hare = head;
        Node turtle = head;
        Node prev= null;
        while(hare != null && hare.next != null && turtle != null) {
            prev = turtle;
            hare = hare.next.next;
            turtle = turtle.next;
        }
        prev.next = turtle.next;
        return head;
    }
}
