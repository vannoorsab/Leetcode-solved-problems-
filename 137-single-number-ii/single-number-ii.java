class Solution {
    public int singleNumber(int[] nums) {
        int res1=0,res2=0;
        for(int num:nums){
            res1^=num&(~res2);
            res2^=num&(~res1);
        }
        return res1;
        
    }
}