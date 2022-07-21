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
public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false, 0);
    }
    
    public int helper(TreeNode root, boolean isLeft, int sum){
        if(root == null)return 0; 
        
        if(root.left == null && root.right == null && isLeft)
            return sum + root.val;
        
        return helper(root.left, true, sum) + helper(root.right, false, sum);
        
    }
}