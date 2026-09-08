/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
         if(root==null) return res;
        Deque<Node> q=new ArrayDeque<>();
       q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
             List<Integer> level=new ArrayList<>();
            for(int i=0;i<s;i++){
                Node temp=q.remove();
                level.add(temp.val);
                for(Node c:temp.children){
                    q.offer(c);
                }
                //check for childrens
             //  if(temp.children!=null) q.offer(temp.children);
              //  if(temp.right!=null)q.offer(temp.right);
            }
           /* for(Node c:children){
                
            }*/
            res.add(level);
        }
    return res;

    }
}