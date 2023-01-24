class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
//       if the head is null (i.e if linked list is empty) than return null
        if(head == null) {
            return null;
        }
      
//       make a pointer to head
        Node ptr = head;
      
//       to count the length of the list
        int count = 1;
        while(ptr.next != null && count < k) {
            count++;
            ptr = ptr.next;
        }
        Node temp = ptr;

//       if the length of the list is smaller than the value k than return null
        if(count > k) {
            return null;
        }
      
//       this loop is used to get to the last node of the list
        while(ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
}
