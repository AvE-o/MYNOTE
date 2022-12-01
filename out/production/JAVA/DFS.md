# Depth First Search

             1
           /  \
          2   3
        /   \
       4     5
       
 Inorder(left,root,right) 4 2 5 1 3
 Preorder(root,left,right) 1 2 4 5 3
 Postorder(left,right,root) 4 5 2 3 1

// Java program for different tree traversals
/* Class containing left and right child of current
// Recursion
class BinaryTree {
    // Root of Binary Tree
    Node root;
    
    BinaryTree()
    {
        root = null;
    }
    
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {    
        //base case
        if (node == null)
            return;
        /* first recur on left child */   left
        printInorder(node.left);
        
        /* then print the data of node */ middle
        System.out.print(node.key + " ");
        
        /* now recur on right child */    right
        printInorder(node.right);
    }
}