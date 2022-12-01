# Breadth First Search[Level Order Traversal]

             1
           /  \
          2    3 
        /   \  
       4     5

Queue: [1, 2, 3, 4, 5]
add 1 | pop 1 add to output | add 1's child 2 3 | pop 2 |
add 2's child 4 5 | pop 3 | pop 4 | pop 5
Output for Queue: 1 2 3 4 5
Output:
    1
   2 3
  4 5

// Recursion[?] Queue would be better
class BinaryTree {
    // Root of the Binary Tree
    Node root;
 
    public BinaryTree() { root = null; }
 
    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
 
    /* Print nodes at the current level */
    void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
}