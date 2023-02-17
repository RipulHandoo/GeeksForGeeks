class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if (node == null) {
            return;
        }
        
//         this will be condition by which we'll cover all the cases as if the node has both child or have only one child or donot have any child
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        
        mirror(node.left);
        mirror(node.right);
    }
}
