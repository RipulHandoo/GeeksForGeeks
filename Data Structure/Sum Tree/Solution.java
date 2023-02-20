class Solution
{
    int sum(Node root) {
        if(root == null) {
            return 0;
        }
        
        int left = sum(root.left);
        int right = sum(root.right);
        
        return left + right + root.data;
    }
	boolean isSumTree(Node root)
	{
             // Your code here
             if(root == null) {
                 return true;
             }
             if(root.left == null && root.right == null) {
                 return true;
             }
             
             int leftSum = sum(root.left);
             int rightSum = sum(root.right); 
             
             if(root.data == leftSum + rightSum && isSumTree(root.left) && isSumTree(root.right)) {
                 return true;
             }
             return false;
	}
}
