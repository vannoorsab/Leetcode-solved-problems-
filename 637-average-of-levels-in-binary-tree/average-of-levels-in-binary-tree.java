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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res= new ArrayList<>();
       if(root==null) return res;
        Deque<TreeNode> q=new ArrayDeque<>();
       q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
             double ans=0.0;
            for(int i=0;i<s;i++){
                TreeNode temp=q.remove();
                ans+=temp.val;
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
            }
            res.add(ans/s);
        }
        return res;
    }
}