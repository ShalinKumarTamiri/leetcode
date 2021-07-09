/*

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Input: root = [1,2,2,3,4,4,3]
Output: true

*/

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right==null))
            return true;
        return isSameTree(root.left,root.right);
    }
    
    public boolean isSameTree(TreeNode a, TreeNode b) {
        if((a == null && b!=null) || (a != null && b==null))
            return false;
        if(a==null && b==null)
            return true;
        if(a.val != b.val)
            return false;
        return isSameTree(a.left,b.right) && isSameTree(a.right,b.left);
        
    }
}
