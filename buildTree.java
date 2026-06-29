package Day_5;

import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class buildTree {

    private int preorderIndex = 0;
    private HashMap<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // Store inorder value and its index
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return helper(preorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int left, int right) {

        if (left > right)
            return null;
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        int index = inorderMap.get(rootValue);
        root.left = helper(preorder, left, index - 1);
        root.right = helper(preorder, index + 1, right);

        return root;
    }
    public void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = obj.buildTree(preorder, inorder);

        System.out.println("Inorder Traversal of Constructed Tree:");
        obj.printInorder(root);
    }
}