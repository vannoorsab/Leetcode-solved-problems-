class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int result=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                result^=nums[i];
                i++;
            }
        }
        return result;
        
    }
}