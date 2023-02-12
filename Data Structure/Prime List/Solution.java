class Solution
{
    boolean isPrime(int data) {
        for(int i = 2;i<=Math.sqrt(data);i++) {
            if(data%i == 0) {
                return false;
            }
        }
        return true;
    }
    Node primeList(Node head){
        //code here
        Node ptr = head;
        while(ptr != null) {
            int left = ptr.val -1;
            int right = ptr.val +1;
            int num1 = 0;
            int num2 = 0;
            if(!isPrime(ptr.val)) {
                while(left > 0 || right > 0) {
                    if(isPrime(left)) {
                        num1 = left;
                        break;
                    }
                    else if(isPrime(right)) {
                        num2 = right;
                        break;
                    }
                    left--;
                    right++;
                }
                if(ptr.val - num1 > ptr.val - num2) {
                    ptr.val = num2;
                }
                else {
                    ptr.val = num1;
                }
            }
            if(ptr.val == 1) {
                ptr.val = 2;
            }
            ptr = ptr.next;
        }
        return head;
    }
}
