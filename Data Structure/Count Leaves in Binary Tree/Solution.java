class Tree
{
    int count = 0;
    int countLeaves(Node node) 
    {
         // Your code 
         if(node == null) {
            return 0;
        }
        if(node.left == null && node.right == null) {
            count++;
        }
        countLeaves(node.left);
        countLeaves(node.right);
        return count;
    }
}
