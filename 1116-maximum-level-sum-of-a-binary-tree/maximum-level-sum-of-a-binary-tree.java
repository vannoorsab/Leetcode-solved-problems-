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
    //static count=0;
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        Deque<TreeNode> q=new ArrayDeque<>();
        int level=0;
        int currentlevel=1;
       q.offer(root);
       int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int s=q.size();
             int ans=0;
            for(int i=0;i<s;i++){
                TreeNode temp=q.remove();
                ans+=temp.val;
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
            }
            if(ans>max){
                max=ans;
                level=currentlevel;
            }
            currentlevel++;
            //res.add(ans/s);
        }
        return level;
    }
}