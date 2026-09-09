class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
while(num!=0){
   int value=num%10;
          if(temp%value==0){
                count++;
            }
            num/=10;
        }
    
        return count;
    }
}