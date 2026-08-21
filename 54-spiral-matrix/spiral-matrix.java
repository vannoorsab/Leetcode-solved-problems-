class Solution {
   /* private void spiral_push(int ){
        for(int i=;i<;i++){
            list.add(matrix[][]);
        }
    }*/
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int rb=0;
        int cb=0;
        int re=row-1;
        int ce=col-1;
        while(rb<=re&&cb<=ce){
        //right direction
        for(int i=cb;i<=ce;i++){
            list.add(matrix[rb][i]);
       // spiral_push(int i,)
        }
        rb++;
        //down direction
        for(int j=rb;j<=re;j++){
            list.add(matrix[j][ce]);
        }
        ce--;
        //left direction
        if(rb<=re){
        for(int m=ce;m>=cb;m--){
            list.add(matrix[re][m]);
        }
        re--;
        }
        //up directoon
        if(cb<=ce){
        for(int n=re;n>=rb;n--){
            list.add(matrix[n][cb]);
        }
        cb++;
        }

        }
        return list;

    }
}