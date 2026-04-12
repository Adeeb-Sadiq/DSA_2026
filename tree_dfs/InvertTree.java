package tree_dfs;

public class InvertTree {
    static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    static void main() {
        TreeNode.traverse(TreeNode.getTree());
        System.out.println();
        TreeNode root = invertTree(TreeNode.getTree());
        TreeNode.traverse(root);
    }
}
