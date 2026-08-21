class Solution {
    public int[][] generateMatrix(int n) {
        int [][]matrix=new int[n][n];
        int rb=0;
        int cb=0;
        int re=n-1;
        int ce=n-1;
        int count=1;
        while(rb<=re&&cb<=ce){
            for(int i=cb;i<=ce;i++){
                matrix[rb][i]=count++;
            }
            rb++;
            for(int j=rb;j<=re;j++){
            matrix[j][ce]=count++;
        }
        ce--;
        //left direction
        if(rb<=re){
        for(int m=ce;m>=cb;m--){
            matrix[re][m]=count++;
        }
        re--;
        }
        //up directoon
        if(cb<=ce){
        for(int r=re;r>=rb;r--){
            matrix[r][cb]=count++;
        }
        cb++;
        }

        }
        return matrix;
        
    }
}