class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int []arr=new int[2];
        int ans=0;
        int n=nums.length;
        int total=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                ans+=nums[i];
            }else{
                arr[0]=nums[i];
            }
        }
        arr[1]=total-ans;
        return arr;
    }
}