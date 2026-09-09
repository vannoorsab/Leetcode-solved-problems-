class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        int took=0;
        int ans=0;
        Arrays.sort(cost);
        for(int i=n-1;i>=0;i--){
            if(took==2){
                took=0;
            }else{
                ans+=cost[i];
                took++;
            }
        }
        return ans;
    }
}