class Solution {
    public int minOperations(int[] nums, int sum) {
        int dp[]=new int[sum+1];
        Map<Integer,Integer>map=new HashMap<>();
        final int INF=1_000_000_000;
        Arrays.fill(dp,INF);
        dp[0]=0;
        for(int num:nums){
            int []ndp=Arrays.copyOf(dp,sum+1);
            int val=num;
            int cost=0;
            while(val>0){
                if(val<=sum){
                    for(int j=sum;j>=val;j--){
                        if(dp[j-val]!=INF){
                            ndp[j]=Math.min(ndp[j],dp[j-val]+cost);
                        }
                    }
                }
                val/=2;
                cost++;
            }
            long lval=(long)num*2;
            cost=1;
            while(lval<=sum){
                int ival=(int)lval;
                for(int j=sum;j>=ival;j--){
                    if(dp[j-ival]!=INF){
                        ndp[j]=Math.min(ndp[j],dp[j-ival]+cost);
                    }
                }
                lval*=2;
                cost++;
            }
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                int t=entry.getKey();
                int tc=entry.getValue();
                for(int j=sum;j>=t;j--){
                    if(dp[j-t]!=INF){
                        ndp[j]=Math.min(ndp[j],dp[j-t]+tc);
                    }
                }
            }
            dp=ndp;
            
        }
        return dp[sum]==INF?-1:dp[sum];
    }
}