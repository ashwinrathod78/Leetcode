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
    int pre = 0;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1);
        
    }
    
    TreeNode buildTree(int[] preorder, int[] inorder, int s, int e) {
        if(s > e) return null;
        TreeNode root = new TreeNode(preorder[pre++]);
        int index = map.get(root.val);
        root.left = buildTree(preorder, inorder, s, index - 1);
        root.right = buildTree(preorder, inorder, index+1, e); 
        return root;
    }
}