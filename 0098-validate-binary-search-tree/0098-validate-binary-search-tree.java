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
    public boolean isValidBST(TreeNode root) {
        List<Integer> in = new LinkedList<>();

        helper(root, in);

        boolean isbst = true;

        int prev = in.get(0);

        for(int i=1; i<in.size(); i++){
            if(in.get(i)<=prev){
                isbst = false;
            }

            prev = in.get(i);
        }

        return isbst;
    }

    public void helper(TreeNode root,List<Integer> in ){
        if(root==null){
            return;
        }

        helper(root.left, in);
        in.add(root.val);

        helper(root.right, in);
    }
}