class Solution {
    private void backtracking(int row,int n,char[][] arr,List<List<String>>res){
        if(row==n){
        List<String>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new String(arr[i]));
        }
        res.add(list);
        return ;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,arr,n)){
                arr[row][col]='Q';
                backtracking(row+1,n,arr,res);
                arr[row][col]='.';
            }
        }
  

    }
    public int totalNQueens(int n) {
        List<List<String>>list=new ArrayList<>();
        char chess[][]=new char[n][n];
        for(char[] ch:chess){
        Arrays.fill(ch,'.');
        }
    
        backtracking(0,n,chess,list);
        return list.size();
        
    }
     public boolean isSafe(int row,int col,char[][]chess,int n){
        //horizantal
       /* for(int i=0;i<n;i++){
                if(chess[row][i]=='Q'){
                    return false;
                } 
        }*/
        //vertical check
        for (int i = row - 1; i >= 0; i--) {
    if (chess[i][col] == 'Q') return false;
}
        //left diagoanl check
       for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    if (chess[i][j] == 'Q') return false;
}
        //right diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
    if (chess[i][j] == 'Q') return false;
}
                
                return true;
    }
}