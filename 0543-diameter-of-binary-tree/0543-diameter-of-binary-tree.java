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
     int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       
       
        sol(root);
        return res;
        
    }

    public int sol(TreeNode root){

        if(root==null){
            return 0;
        }
        

        int lef = sol(root.left);
        int ri = sol(root.right);

        res = Math.max(res, lef+ri);

        return 1+Math.max(lef, ri);

      
    }
}