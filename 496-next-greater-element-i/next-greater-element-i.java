class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []result=new int[nums1.length];
          Stack<Integer>s1=new Stack<>();
          HashMap<Integer,Integer>hs1=new HashMap<>();
          for(int num:nums2){
            while(!s1.isEmpty()&&num>s1.peek()){
                hs1.put(s1.pop(),num);
            }
            s1.push(num);
          }
                      int i=0;

          for(int num:nums1){
            if(hs1.containsKey(num)){
                result[i++]=hs1.get(num);
            }
            else
            {
                result[i++]=-1;
            }
          }
          return result;


    }
}