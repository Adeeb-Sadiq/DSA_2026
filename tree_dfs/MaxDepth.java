package tree_dfs;

public class MaxDepth {
    static void main() {
        System.out.println(maxDepth(TreeNode.getTree()));
    }

    private static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }
}
