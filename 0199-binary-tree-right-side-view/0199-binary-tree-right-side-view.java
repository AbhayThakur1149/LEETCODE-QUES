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
    public void helper(TreeNode root, int level, List<Integer> output){
        if(root == null) return;
        // if(root.left == null && root.right == null) return;
        if(level == output.size()){
            output.add(root.val);
        }
        helper(root.right, level + 1, output);
        helper(root.left, level + 1, output);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> output = new ArrayList<>();
        helper(root, 0, output);
        return output;
        
    }
}