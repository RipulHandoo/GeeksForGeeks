class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            list.add(0, temp.data);
            if(temp.right != null) {
                q.add(temp.right);
            }
            if(temp.left != null) {
                q.add(temp.left);
            }
        }
        return list;
    }
}
