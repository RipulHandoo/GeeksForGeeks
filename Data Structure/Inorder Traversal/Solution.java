class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> inOrder(Node root) {
        // Code
        if(root == null) {
            return list;
        }
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
        return list;
    }
}
