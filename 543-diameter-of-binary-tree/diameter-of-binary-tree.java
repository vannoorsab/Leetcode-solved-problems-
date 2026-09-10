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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return res;
    }
    private int diameter(TreeNode root){
                if(root==null) return 0;
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        //System.out.println(root.val);
        res=Math.max(res,ld+rd);
        return 1+Math.max(ld,rd);
    }
}