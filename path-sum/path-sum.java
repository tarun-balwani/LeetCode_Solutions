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
    public boolean hasPathSum(TreeNode root, int targetSum) {
     int currSum = 0;
     return hasSum(root,targetSum,currSum);
    }
    
    public boolean hasSum(TreeNode root, int targetSum, int currSum){
        
        if(root == null){
            return false;
        }
        if(root.left == null & root.right == null){
            if(currSum + root.val == targetSum) return true;
        }
        
        return (hasSum(root.left, targetSum, currSum+root.val) || hasSum(root.right, targetSum, currSum+root.val));
        
    }
}