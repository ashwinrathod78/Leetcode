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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        if(root.left != null && root.right != null) {
             TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
        } else if( root.left != null) {
            root.right = root.left;
            root.left = null;
        } else {
           root.left = root.right;
            root.right = null;
        }
        
        return root;
    }
}