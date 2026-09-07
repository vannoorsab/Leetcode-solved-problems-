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
             List<Integer>res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
      //  List<Integer>res=new ArrayList<>();
        if(root==null) return res;
        //root ->left->right
        //first add root
        res.add(root.val);
        //for left side
        preorderTraversal(root.left);

        //right side
        preorderTraversal(root.right);
        return res;
            }
}