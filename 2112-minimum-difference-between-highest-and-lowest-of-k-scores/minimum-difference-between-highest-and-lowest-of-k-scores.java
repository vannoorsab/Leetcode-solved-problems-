class Solution {
    public int minimumDifference(int[] nums, int k) {
       if(k==1) return 0;
               Arrays.sort(nums);
       int n=nums.length;
       int sum=Integer.MAX_VALUE;
       for(int i=0;i+k-1<n;i++){
        int diff=nums[i+k-1]-nums[i];
        sum=Math.min(diff,sum);
       }
       return sum;
    }
}