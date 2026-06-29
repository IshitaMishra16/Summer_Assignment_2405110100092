package Day_2;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    public static void main(String[] args) {
        Math obj = main();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> ans = obj.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + ans);
    }
    private static Math main() {
        throw new UnsupportedOperationException("Unimplemented method 'main'");
    }
}