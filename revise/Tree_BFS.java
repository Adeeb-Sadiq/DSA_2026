package revise;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_BFS {
    static void main() {
        TreeNode root = TreeNode.getTree();
        System.out.println("Traverse:");
        bfs(root);
        System.out.println("\n\nLevels:");
        levels(root);
    }

    static void bfs(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
        }
    }

    static void levels(TreeNode root) {
        if(root == null) return;
        int level = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int size = q.size();
            System.out.print(level + ": ");
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                System.out.print(node.val + " ");
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            level++;
            System.out.println();
        }
    }
}
