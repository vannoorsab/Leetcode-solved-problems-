class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int rsum=0;
        int lsum=0;

        for(int i=0;i<nums.length;i++){
            rsum=totalsum-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }else{
                lsum+=nums[i];
        }
            
        }
        return -1;

        
    }
}