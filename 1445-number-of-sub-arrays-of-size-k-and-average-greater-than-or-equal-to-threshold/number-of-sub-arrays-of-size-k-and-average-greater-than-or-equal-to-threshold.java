class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int count=0;
        int l=0;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            if(r-l+1==k){
                //sum-=arr[l];
                if(sum/k>=threshold){
                    count++;
                }
                sum-=arr[l];
                l++;
            }
        }
        return count;
    }
}