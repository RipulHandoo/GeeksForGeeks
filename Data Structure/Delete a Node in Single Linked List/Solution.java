class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	if(head == null) {
	    return null;
	}
	
	if(x == 1) {
	    head = head.next;
	    return head;
	}
	else {
	    Node ptr = head;
    	x--;
    	while(x != 1) {
    	    ptr = ptr.next;
    	    x--;
    	}
    	ptr.next = ptr.next.next;
    	return head;
	}
    }
}
