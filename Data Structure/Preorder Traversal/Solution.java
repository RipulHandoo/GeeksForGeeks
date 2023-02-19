class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        preOrderRec(root,list);
        return list;
    }
    static void preOrderRec(Node root,ArrayList<Integer> list) {
        if(root == null) {
            return;
        }  
        list.add(root.data);
        preOrderRec(root.left,list);
        preOrderRec(root.right,list);
    }
}
