class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int n=nums.length;
        int sum=0;
        int count=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                count=Math.min(count,r-l+1);
                sum-=nums[l];
                l++;
            }
            
            
        }if(count==Integer.MAX_VALUE) return 0;
        else{
        return count;
        }
    }
}