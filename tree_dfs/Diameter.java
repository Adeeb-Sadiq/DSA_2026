package tree_dfs;

public class Diameter {
    static int diameter = 0;

    static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return diameter;
    }

    static int helper(TreeNode root) {
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }

    static void main() {
        System.out.println(diameterOfBinaryTree(TreeNode.getTree()));
    }
}
