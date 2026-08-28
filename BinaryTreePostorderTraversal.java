import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        list = preorderTraversal(root);
        System.out.println(list);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public static void preorder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        preorder(root.left, list);
        preorder(root.right, list);
        list.add(root.val);
    }
}
