class Solution {
    public long minMergeCost(int[][] lists) {
        int n=lists.length;
        int N=1<<n;
        int [][]peldarquin =lists;
        long [] dp=new long[N];
        Arrays.fill(dp,Long.MAX_VALUE);
        int[] totalLen =new int[N];
        long [] median =new long[N];
        for(int mask=1;mask<N;mask++){
            List<Integer>merged =new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask& (1<<i)) !=0){
                    for(int x : lists[i]) merged.add(x);
                }
            }
            Collections.sort(merged);
            totalLen[mask]=merged.size();
            median[mask]=merged.get((merged.size()-1)/2);

            if((mask&(mask-1))==0){
                dp[mask]=0;
            }
        }
        for(int mask=1;mask<N;mask++){
            if(dp[mask]==0)continue;
            for(int sub=(mask-1)&mask; sub>0;sub=(sub-1)&mask){
                int other =mask^sub;
                if(other==0)continue;
                if(sub>other)continue;
                long cost=dp[sub]+dp[other]+totalLen[sub]+totalLen[other]+Math.abs(median[sub]-median[other]);
                dp[mask]=Math.min(dp[mask],cost);
            }
        }
        return dp[N-1];
    }
}