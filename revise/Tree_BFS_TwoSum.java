package revise;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Tree_BFS_TwoSum {
    static void main() {
        TreeNode root = TreeNode.getTree();
        twoSum(root, 11);
    }

    static void twoSum(TreeNode root, int target) {
        if(root == null) return;
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(set.contains(target - node.val)) {
                System.out.println(node.val + " " + (target - node.val));
                return;
            }
            set.add(node.val);
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
    }
}
