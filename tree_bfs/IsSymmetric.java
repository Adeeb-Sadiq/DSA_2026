package tree_bfs;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetric {
    public static boolean isSymmetric (TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror (TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static boolean isSymmetric_bfs (TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);

        while(!q.isEmpty()) {
            TreeNode left = q.poll();
            TreeNode right = q.poll();

            if(left == null && right == null) continue;

            if(left == null || right == null || left.val != right.val) return false;

            q.offer(left.left);
            q.offer(right.right);
            q.offer(left.right);
            q.offer(right.left);
        }

        return true;
    }

    static void main() {
        System.out.println("DFS");
        System.out.println(isSymmetric(TreeNode.getTree()));
        System.out.println(isSymmetric(TreeNode.SymmetricTree()));
        System.out.println("BFS");
        System.out.println(isSymmetric_bfs(TreeNode.getTree()));
        System.out.println(isSymmetric_bfs(TreeNode.SymmetricTree()));
    }
}
