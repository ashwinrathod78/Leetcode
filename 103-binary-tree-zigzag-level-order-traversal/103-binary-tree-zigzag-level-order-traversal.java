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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) { 
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) return result;
		List<Integer> curList = null;
		boolean zigzag = false;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(queue.isEmpty() == false) {
			curList = new ArrayList<>();
			int count = queue.size();
			for(int i=0;i<count;i++) {
				TreeNode cur = queue.poll();
				if(zigzag) {
					curList.add(0,cur.val);
				} else {
					curList.add(cur.val);
				}
				if(cur.left != null) queue.add(cur.left);
				if(cur.right != null) queue.add(cur.right);
			}
			result.add(curList);
			zigzag = !zigzag;
		}
        return result;
    }
}