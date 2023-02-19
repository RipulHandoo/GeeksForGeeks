class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList();
        int level = 1;
        q.add(root);
        while(!q.isEmpty()) {
            int c = q.size();
            List<Integer> l = new ArrayList();
            for(int i = 0;i<c;i++) {
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
            if(level%2 == 0) {
                List<Integer> ll = new ArrayList();
                for(int i = l.size() -1;i>=0;i--) {
                    ll.add(l.get(i));
                }
                result.add(ll);
            }
            else {
                result.add(l);
            }
            level++;
        }
        return result;
    }
}
