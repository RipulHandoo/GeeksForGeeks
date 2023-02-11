class Tree
{
    //Function to return list containing elements of left view of binary tree.
    int max_level = 0;
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result = new ArrayList<Integer>();
      view(root,result,1);
      return result;
    }
    
    void view(Node root, ArrayList<Integer> result, int level) {
        if(root == null) {
            return;
        }
        
        if(level > max_level) {
            result.add(root.data);
            max_level = level;
        }
        
        view(root.left,result,level+1);
        view(root.right,result,level+1);
    }
}
