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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        
        if(Height(root)==-1)
            return false;
        
        return true;
    }
    
    public int Height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int lefth=Height(root.left);
        int righth=Height(root.right);
        
        if(lefth==-1 || righth==-1)
            return -1;
        
        if(Math.abs(lefth-righth) > 1)
            return -1;
        
        return Math.max(lefth,righth)+1;
        
    }
    
}