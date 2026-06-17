package revise;

public class SameBinaryTree {
    static void main() {
        TreeNode root = TreeNode.getTree();
        System.out.println(isSameTree(root, root));
        System.out.println(isSameTree(root.left, root.right));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
