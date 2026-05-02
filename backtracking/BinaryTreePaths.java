package backtracking;

import tree_dfs.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    static void main() {
        System.out.println(binaryTreePaths(TreeNode.getTree()));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        allPaths(root, "", result);
        return result;
    }

    private static void allPaths(TreeNode root, String path, List<String> result) {
        if(root == null) return;
        path = path + root.val;
        if(root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        allPaths(root.left, path + "->", result);
        allPaths(root.right, path + "->", result);
    }
}
