class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        int max=1;
       Arrays.fill(arr,1);
        for(int i=1;i<n;i++){
           // int temp=0;
         for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                 arr[i]=Math.max(arr[i],arr[j]+1);                
                }  
            }
            max=Math.max(max,arr[i]);
         }
            

        
        return max;
    }
}