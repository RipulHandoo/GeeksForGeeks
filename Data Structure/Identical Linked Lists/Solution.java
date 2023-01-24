class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        if(head1 == null && head2 == null) {
            return true;
        }
        boolean result = true;
        while(head1 != null && head2 != null) {
            if(head1.data != head2.data) {
                result = false;
                return result;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 != null || head2 != null) {
            return false;
        }
        return result;
    }
}
