class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int count = 0 ;
       for(String i :operations){
        if(i.charAt(1)== '+'){
            count++;
        }else{
            count--;
        }
       }
       return count; 
    }
}