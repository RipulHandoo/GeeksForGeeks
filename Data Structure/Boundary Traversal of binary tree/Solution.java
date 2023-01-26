

class Solution
{
    
    // declare public arraylist so it will be easy to add data into them 
    public ArrayList<Integer> list = new ArrayList<Integer>();
    
    
    // method to add all the leaf nodes
    public void leafNodes(Node root) {
        if(root == null) {
            return;
        }
        leafNodes(root.left);
        if(root.left == null && root.right == null) {
            list.add(root.data);
        }
        leafNodes(root.right);
    }
    
    
    // method to add left subtree nodes
    public void boundaryLeft(Node root) {
        if(root == null) {
            return;
        }
        
        if(root.left != null) {
            list.add(root.data);
            boundaryLeft(root.left);
        }
        else if(root.right != null) {
            list.add(root.data);
            boundaryLeft(root.right);
        }
    }
    
    
    // method to add the right subtree nodes
    public void boundaryRight(Node root) {
        if(root == null) {
            return;
        }
        
        if(root.right != null) {
            boundaryRight(root.right);
            list.add(root.data);
        }
        else if(root.left != null) {
            boundaryRight(root.left);
            list.add(root.data);
        }
    }
	ArrayList <Integer> boundary(Node node)
	{
	   // add the root node into list
	    list.add(node.data);
	    
	   //add all the boundary nodes of left subtree except leaf nodes 
	    boundaryLeft(node.left);
	    
	   // add all the leaf nodes into the list
	    leafNodes(node.left);
	    leafNodes(node.right);
	    
	   // add all the boundary nodes of rigth subtree except leaf nodes
	    boundaryRight(node.right);
	    return list;
	}
}
