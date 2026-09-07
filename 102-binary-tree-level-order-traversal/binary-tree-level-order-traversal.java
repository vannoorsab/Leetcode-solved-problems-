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
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
      //  List<Integer> level=new ArrayList<>();
      if(root==null) return res;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
             List<Integer> level=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode temp=q.remove();
                level.add(temp.val);
                //check for childrens
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
            }
            res.add(level);
        }
        
    return res;

    }
}