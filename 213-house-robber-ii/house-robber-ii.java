class Solution {
    int memo[];
    private int fun(int n,int st,int []num)
    {
        if(n==st) return num[st];
             if(n==st+1) return Math.max(num[st],num[st+1]);
          if(memo[n]!=-1) return memo[n]; 
             memo[n]=Math.max(num[n]+fun(n-2,st,num),fun(n-1,st,num));
    return memo[n];
    }
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        memo=new int [nums.length];
        Arrays.fill(memo,-1);
        int rob=fun(nums.length-2,0,nums);
          memo=new int [nums.length];
        Arrays.fill(memo,-1);
        int rob1=fun(nums.length-1,1,nums);
         return Math.max(rob,rob1);
    }
}