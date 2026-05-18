package tree_dfs;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    static void main() {
        System.out.println(isSameTree(TreeNode.getTree(), TreeNode.getTree()));
        System.out.println(isSameTree(TreeNode.getTree(), TreeNode.getTree2()));
    }
}
