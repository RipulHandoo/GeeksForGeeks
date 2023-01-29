class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       if(root == null) {
           return list;
       }
       postOrder(root.left);
       postOrder(root.right);
       list.add(root.data);
       
       return list;
    }
}
