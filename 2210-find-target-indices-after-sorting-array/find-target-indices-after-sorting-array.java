class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int smalltarget=0;
        for(int num:nums){
            if(num==target){
                count++;
            }else if(num<target) smalltarget++;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<count;i++){
            res.add(smalltarget+i);
        }
        return res;
    }
}