class Solution {
    public boolean isequaldiagonl(int [][] mat1,int y,int x){
        int r=mat1.length;
        int c=mat1[0].length;
        int i=y;
        int j=x;
        int temp=mat1[i][j];
        boolean bool1=true;
        while(i<r&&j<c){
            if(mat1[i][j]!=temp){
                bool1=false;
            }
            i++;
            j++;
        }
            return bool1;
        
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean ans=true;
        for(int j=0;j<c;j++){
        boolean temp=isequaldiagonl(matrix,0,j);
        if(!temp){
            ans=false;
            
        }
        }
        for(int i=1;i<r;i++){
            boolean temp=isequaldiagonl(matrix,i,0);
            if(!temp){
                ans=false;
            
            }
        }
        return ans;
    }
}