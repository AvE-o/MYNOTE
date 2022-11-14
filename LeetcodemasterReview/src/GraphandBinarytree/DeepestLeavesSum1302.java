package GraphandBinarytree;

// DFS[Queue] add/remove
// DFS 特性 Queue 最后总会是 最下层Node
public class DeepestLeavesSum1302 {
    public int deepestLeavesSum(TreeNode root) {
        int result = 0;
        int i = 0;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while (q.size() > 0) {
            result = 0;
            for (i = q.size() - 1; i >= 0; i--) {
                TreeNode tempnode = q.poll();
                result += tempnode.val;
                if (tempnode.left != null) { q.add(tempnode.left); }
                if (tempnode.right != null) { q.add(tempnode.right); }

            }
        }
        return result;

    }
}
