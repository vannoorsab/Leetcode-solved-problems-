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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res =new ArrayList<>();
        if(root==null) return res;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        boolean bool=true;
        while(!q.isEmpty()){
          List<Integer> res1=new ArrayList<>();
          int s=q.size();
          for(int i=0;i<s;i++){
              TreeNode temp=q.pop();
              if(bool){
                res1.add(temp.val);
            }else{
                res1.add(0,temp.val);
            }
              if(temp.left!=null) q.offer(temp.left);
              if(temp.right!=null) q.offer(temp.right);
            
          }
         bool=!bool;
          res.add(res1);

        }
        return res;
    }
}