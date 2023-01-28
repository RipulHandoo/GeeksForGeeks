class Solution
{
  
//   this method is used to reverse the linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head; 
        Node next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
  
//   this method is used to add the linked list by 1
    public static Node addOne(Node head) 
    { 
        //code here.
        Node revList = reverse(head);
        Node ptr = revList;
        int carry = 1;
      
//       this loop will help to update the linked list node's data
        while(ptr != null) {
            int sum = ptr.data + carry;
            carry = sum/10;
            ptr.data  = sum%10;
            ptr = ptr.next;
        }
        
//         reverse the list again to get in correct order
        Node againRev = reverse(revList);
        Node temp = new Node(1);
      
//       if carry is 1 it means that 
//       the size of linked list will be increase (i.e 999 -> 1000) is the basic example why we are adding one new node in the linked list
        if(carry == 1) {
            temp.next = againRev;
            return temp;
        }
      
//       finaly return the list 
        return againRev;
    }
}
