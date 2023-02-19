class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root == null) {
            return null;
        }
        if(root.data > X) {
            root.left = deleteNode(root.left,X);
        }
        else if(root.data < X) {
            root.right = deleteNode(root.right,X);
        }
      
//       when the value of the node is equal to the value that is to be deleted
        else {
//           if the node has no children
            if(root.left == null && root.right == null) {
                return null;
            }
//           when the node has no left child
            else if(root.left == null) {
                root = root.right;
                return root;
            }
//           when the node has no right child
            else if(root.right == null) {
                root = root.left;
                return root;
            }
//           when the node has both child
            int data = min(root.right);
            root.data = data;
            root.right = deleteNode(root.right,data);
            return root;
        }
        return root;
    }
    static int min(Node root) {
        if(root == null) {
            return 0;
        }
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }
}
