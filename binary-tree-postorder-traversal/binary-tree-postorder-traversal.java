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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curr = root;
        
        while(curr != null || !stack.isEmpty()){
            if(curr!= null){
                stack.push(curr);
                curr = curr.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                        result.add(temp.val);
                        while(!stack.isEmpty() && temp == stack.peek().right){
                            temp = stack.pop();
                            result.add(temp.val);
                        }
                }else{
                    curr = temp;
                }
            }
        }
        return result;
    }
}
                              