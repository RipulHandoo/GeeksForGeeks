public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean checkBST(Node root, int min, int max) {
        if(root == null) {
            return true;
        }
        
        if(root.data < min || root.data > max) {
            return false;
        }
        
        return(checkBST(root.left,min,root.data-1)&&
        checkBST(root.right,root.data+1,max));
    }
}
