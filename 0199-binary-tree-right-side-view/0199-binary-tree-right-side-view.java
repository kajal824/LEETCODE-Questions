/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> level = new ArrayList<>();
        if (root == null) {
            return level;
        }

        Queue<TreeNode> l = new LinkedList<>();
        l.add(root);

        while (!l.isEmpty()) {
            int size = l.size();
            for (int i = 0; i < size; i++) {
                TreeNode tv = l.poll();

                if (i == size - 1) {
                    level.add(tv.val);
                }

                if (tv.left != null) {
                    l.add(tv.left);
                }
                if (tv.right != null) {
                    l.add(tv.right);
                }
            }
        }

        return level;
    }
}
