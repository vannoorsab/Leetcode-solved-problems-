class Solution {
    public int numRescueBoats(int[] peoples, int limit) {
        Arrays.sort(peoples);
        int n=peoples.length;
        int count=0;
        int i=0;
        int j=n-1;
       // if(peoples[0]<=limit) count++;
        while(i<=j){
            if(peoples[i]+peoples[j]<=limit){
              // j--;
                i++;
               // count++;
            }
            count++;
            j--;
        }
        return count;
        
    }
}