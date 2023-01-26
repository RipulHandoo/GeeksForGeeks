
//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        if(node== null) {
            return new ArrayList<Integer>();
        }
        
        Queue<Node> q = new ArrayDeque<>();
        
        q.add(node);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!q.isEmpty()){
            Node temp = q.remove();
            list.add(temp.data);
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
        return list;
    }
}
