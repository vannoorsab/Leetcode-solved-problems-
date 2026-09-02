class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int se=source[0];
        int sc=source[1];
        int t1=target[0];
        int t2=target[1];
        if(se==t1&&sc==t2) return 0;
        if(Math.abs(se-t1)==Math.abs(sc-t2)){
            return 1;
        }
        if((se+sc)%2==(t1+t2)%2){
            return 2;
        }
        return -1;
    }
}