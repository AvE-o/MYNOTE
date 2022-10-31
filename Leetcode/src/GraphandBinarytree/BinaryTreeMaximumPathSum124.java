package GraphandBinarytree;

// Example solution
public class BinaryTreeMaximumPathSum124 {
    int maxValue;

    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }

    // recursive method
    private int maxPathDown(TreeNode node) {
        // base case
        if (node == null) return 0;

        // goes all the way to the left of tree
        int left = Math.max(0, maxPathDown(node.left));
        // gose all the way to right of the tree
        int right = Math.max(0, maxPathDown(node.right));

        maxValue = Math.max(maxValue, left + right + node.val);
        // 返回上一层 下面的root 只能选择一侧来往上走 不然不连续
        return Math.max(left, right) + node.val;
    }
}
