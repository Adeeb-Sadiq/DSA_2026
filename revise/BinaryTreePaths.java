package revise;

import java.util.ArrayList;
import java.util.List;


// https://leetcode.com/problems/binary-tree-paths/description/
public class BinaryTreePaths {
    static void main() {
        TreeNode root = TreeNode.getTree();
        ArrayList<String> result = new ArrayList<>();
        backTrack(root, "", result);
        System.out.println(result);
    }

    private static void backTrack(TreeNode root, String path, ArrayList<String> result) {
        if(root == null) return;
        path = path + root.val;
        if(root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        backTrack(root.left, path + "->", result);
        backTrack(root.right, path + "->", result);
    }
}
