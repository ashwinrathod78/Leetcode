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
        return buildTree(inorder,preorder,  0, preorder.length - 1);
        
    }
    
    TreeNode buildTree(int[] inorder,int[] preorder,  int s, int e) {
        if(s > e) return null;
        TreeNode root = new TreeNode(preorder[pre++]);
        int index = map.get(root.val);
        root.left = buildTree(inorder,preorder,  s, index - 1);
        root.right = buildTree( inorder, preorder,index+1, e); 
        return root;
    }
}