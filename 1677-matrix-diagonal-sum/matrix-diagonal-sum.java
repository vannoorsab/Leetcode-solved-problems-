class Solution {
    public int diagonalSum(int[][] mat) {
        int r=mat.length;
    int sum=0;
    int j=r-1;
    for(int i=0;i<r;i++){
        sum+=mat[i][i];
        sum+=mat[i][j];
        j--;
        }
            return r%2==0?sum:sum-mat[r/2][r/2];
        
    }
}