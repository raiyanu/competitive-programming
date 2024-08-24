public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(5, left, right);
        System.out.println(sol.checkTree(root));
    }
}

class Solution {
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
