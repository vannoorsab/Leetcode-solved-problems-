class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer>list=new HashSet<>();
       // ArrayList<Integer,Integer>list=new ArrayList<>();
        for(int  num:nums){
            if(list.contains(num)){
                return num;
            }
            list.add(num);
        }
        return -1;
        
    }
}