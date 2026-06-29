package Day_4;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class maxPathSum{

    static class Solution {
        int maxSum = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            maxGain(root);
            return maxSum;
        }
        private int maxGain(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int leftGain = Math.max(maxGain(node.left), 0);
            int rightGain = Math.max(maxGain(node.right), 0);
            int currentPathSum = node.val + leftGain + rightGain;
            maxSum = Math.max(maxSum, currentPathSum);
            return node.val + Math.max(leftGain, rightGain);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3)
        );
        Solution sol = new Solution();
        System.out.println("Maximum Path Sum = " + sol.maxPathSum(root));
        TreeNode root2 = new TreeNode(
                -10,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        Solution sol2 = new Solution();
        System.out.println("Maximum Path Sum = " + sol2.maxPathSum(root2));
    }
}
