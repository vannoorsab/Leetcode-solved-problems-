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
    public int averageOfSubtree(TreeNode root) {
        findaverage(root);
        return res;        
    }
    private int[]findaverage(TreeNode root){
        if(root==null) return new int[]{0,0};
        int []left=findaverage(root.left);
        int []right=findaverage(root.right);
        int sum=left[0]+right[0]+root.val;
        int sum1=left[1]+right[1]+1;
        if(sum/sum1==root.val) res++;
        return new int[]{sum,sum1};
    }
}