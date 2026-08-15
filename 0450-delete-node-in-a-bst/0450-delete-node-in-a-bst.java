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
    public void delete(TreeNode root, int target){
        if(root == null) return;
        if(target < root.val){ //goes left to check
            if(root.left == null) return;
            if(root.left.val == target){
                TreeNode r1 = root.left;
                if(r1.left == null && r1.right == null)  root.left = null; // delete if node has zero child;
                else if(r1.left == null || r1.right == null){
                    if(r1.left != null){
                        root.left = r1.left;
                    }else{
                        root.left = r1.right;
                    }  
                }else{
                TreeNode curr = r1;
                TreeNode pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                delete(root, pred.val);
                pred.left = curr.left;
                pred.right = curr.right;
                root.left = pred;
            }
            }
            else delete(root.left, target);

        }else{
            if(root.right == null) return;
            if(root.right.val == target){
                TreeNode r2 = root.right;
                if(r2.left == null && r2.right == null) root.right = null;
                else if(r2.left == null || r2.right == null){
                    if(r2.left != null) root.right = r2.left;
                    else root.right = r2.right;
                }else{
                TreeNode curr = r2;
                TreeNode pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                delete(root, pred.val);
                pred.left = curr.left;
                pred.right = curr.right;
                root.right = pred;
            }
            }
            else delete(root.right, target);
        }

    }
    public TreeNode deleteNode(TreeNode root, int target) {
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;

        delete(temp, target);
        root = temp.left;
        
        return temp.left;
        
    }
}