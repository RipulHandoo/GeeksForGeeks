# Connect Nodes at Same Level

# Given a binary tree, connect the nodes that are at the same level. The structure of the tree Node contains an addition nextRight pointer for this purpose.Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node.


Example 1:

Input:
     3
   /  \
  1    2
Output:
3 1 2
1 3 2
Explanation:The connected tree is
       3 ------> NULL
     /   \
    1---> 2 -----> NULL
