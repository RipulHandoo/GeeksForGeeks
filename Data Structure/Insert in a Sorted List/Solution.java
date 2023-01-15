// Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.

// Example 1:

// Input:
// LinkedList: 25->36->47->58->69->80
// data: 19
// Output: 19 25 36 47 58 69 80
// Example 2:

// Input:
// LinkedList: 50->100
// data: 75
// Output: 50 75 100
// Your Task:
// The task is to complete the function sortedInsert() which should insert the element in sorted Linked List and return the head of the linked list

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 <= N <= 104
// -99999 <= A[i] <= 99999, for each valid i

class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node temp = new Node(key);
        Node ptr = head1;
        if(head1.data >= temp.data) {
            temp.next = head1;
            head1 = temp;
            return head1;
        }
        // while(ptr != null && ptr.next != null) {
        //     if(ptr.next != null && ptr.next.data >= temp.data){
        //         temp.next = ptr.next;
        //         ptr.next = temp;
        //         return head1;
        //     }
        //     ptr = ptr.next;
        // }
        // if(ptr.data <= temp.data) {
        //     ptr.next = temp;
        //     return head1;
        // }
        Node current = head1;
        while (current.next != null && current.next.data < temp.data) {
            current = current.next;
        }
 
        temp.next = current.next;
        current.next = temp;
        return head1;
    }
}
