package tree_bfs;

public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode getTree() {
        TreeNode root = new TreeNode(1);
        TreeNode second = new TreeNode(2); root.left = second;
        TreeNode third = new TreeNode(4); second.left = third;
        TreeNode fourth = new TreeNode(5); second.right = fourth;
        TreeNode fifth = new TreeNode(3); root.right = fifth;
        TreeNode sixth = new TreeNode(6); fifth.left = sixth;
        TreeNode seventh = new TreeNode(7); fifth.right = seventh;

        return root;
    }
}
