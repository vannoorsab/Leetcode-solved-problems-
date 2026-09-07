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
    private int leftheight(TreeNode root){
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
    }
return h;
            
    }
    private int rightheight(TreeNode root){
            int h=0;
            while(root!=null){
                h++;
                root=root.right;
            }
            return h;
    }
    
    public int countNodes(TreeNode root) {

        if(root==null) return 0;
        //for leftheight
        int lh=leftheight(root);
        //for righthight
        int rh=rightheight(root);
        if(lh==rh) return (1<<lh)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}