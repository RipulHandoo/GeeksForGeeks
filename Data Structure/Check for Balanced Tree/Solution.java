class Tree
{
    
    boolean isBalanced(Node root) {
        if (root == null)
            return true;

        /* Get the height of left and right sub-trees */
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right))
            return true;

        return false;
    }
     int height(Node node) {
        if (node == null)
            return 0;

        /* Recursively calculate the height of left and right sub-trees */
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        /* Return the maximum of left and right sub-tree heights plus 1 */
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
