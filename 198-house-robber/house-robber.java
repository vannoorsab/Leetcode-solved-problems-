class Solution {
    int []memo;
    private int fun(int n,int[] m){
        if(n==0)return m[0];
        if(n==1) return Math.max(m[0],m[1]);
        if(memo[n]!=-1) return memo[n];
         memo[n]=Math.max(m[n]+fun((n-2),m),fun((n-1),m));
         return memo[n];
        
    }
    public int rob(int[] nums) {
        int n=nums.length;
        memo=new int[n];
        Arrays.fill(memo,-1);
        return fun(n-1,nums);
    }
}