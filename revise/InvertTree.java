package revise;

public class InvertTree {
    static void main() {
        TreeNode root = TreeNode.getTree();
        TreeNode.printTree(root);
        invertTree(root);
        TreeNode.printTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
