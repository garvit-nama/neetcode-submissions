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
    private boolean compare(TreeNode root, long left, long right){
        if(root == null){
            return true;
        }
        if(!(left<root.val && right>root.val)) return false;
        return compare(root.left, left, root.val) && 
               compare(root.right, root.val, right);
    }
    public boolean isValidBST(TreeNode root) {
    return compare(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
