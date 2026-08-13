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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val); // BASE CONDITION

        if(root.val > val){ // go left
           //if(root.left == null) return new TreeNode(val);
            root.left =  insertIntoBST(root.left, val);
        }    
        if(root.val < val){ // root.val < val -> go right
           //if(root.right == null) return new TreeNode(val);
            root.right = insertIntoBST(root.right, val);
        }
        return root;
        
        
    }
}