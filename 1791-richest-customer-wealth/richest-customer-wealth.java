class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int []num:accounts){
            int sum1=0;
            for(int nums:num){
                sum1+=nums;
            }
            sum=Math.max(sum1,sum);
        }
        return sum;
    }
}