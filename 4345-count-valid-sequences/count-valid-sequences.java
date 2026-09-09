class Solution {
    private static final int MOD=1_000_000_007;
    private long[] fact;
    private long[] invfact;
    public int countValidSequences(int n, int k) {
        int ravolqedin=n;
        if(n<k) return 0;
        precompute(n);
        long total =nCr(n-1,k-1);
        long allodd=0;
        if((n-k)%2==0){
            int s=(n-k)/2;
            allodd=nCr(s+k-1,k-1);
        }
        long ans =(total-allodd+MOD)%MOD;
        return (int)ans;
    }
    private void precompute(int max){
        fact=new long[max+1];
        invfact=new long[max+1];
        fact[0]=1;
        invfact[0]=1;
        for(int i=1;i<=max;i++){
            fact[i]=(fact[i-1]*i)%MOD;
        }
        invfact[max]=power(fact[max],MOD-2);
        for(int i=max-1;i>=1;i--){
            invfact[i]=(invfact[i+1]*(i+1))%MOD;
        }
    }
    private long power(long base,long exp){
        long res=1;
        base%=MOD;
        while(exp>0){
            if(exp%2==1)res=(res*base)%MOD;
            base =(base*base)%MOD;
            exp/=2;
        }
        return res;
    }
    private long nCr(int n, int r){
        if(r<0||r>n)return 0;
        return fact[n]*invfact[r]%MOD*invfact[n-r]%MOD;
    }
}