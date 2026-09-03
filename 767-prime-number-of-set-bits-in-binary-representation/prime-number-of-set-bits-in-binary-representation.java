class Solution {
    private static int fun(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum++;
            }
        }
        return sum;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int ones=Integer.bitCount(i);
            if(fun(ones)==2){
                count++;
            }

        }
        return count;

        
    }
}