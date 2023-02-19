class Solution {
    Node first, last, middle, prev;
    public Node correctBST(Node root) {
        // code here.
        first = middle = last= prev = null;
        correctBSTUtil(root);
        if(first != null && last != null) {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        }
        else if(first != null && middle != null) {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
        return root;
    }
    
    void correctBSTUtil(Node root) {
        if(root == null) {
            return;
        }
        correctBSTUtil(root.left);
        if(prev != null && prev.data > root.data) {
            if(first == null){
                first = prev;
                middle = root;
            }
            else {
                last = root;
            }
        }
        
        prev = root;
        correctBSTUtil(root.right);
    }
}
