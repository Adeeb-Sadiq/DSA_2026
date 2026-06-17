package revise;

public class MaxDepthOfTree {
    static void main() {
        TreeNode root = TreeNode.getTree();
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
