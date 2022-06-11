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
        List<Integer> result = new ArrayList<>();
        if(root == null)    return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.isEmpty() == false) {
            int count = queue.size();
            for(int i=0;i<count;i++) {
                TreeNode cur = queue.poll();
                if(i == count-1)    result.add(cur.val);
                if(cur.left != null)    queue.add(cur.left);
                if(cur.right != null)   queue.add(cur.right);
            }
        }   
        return result;
    }
}