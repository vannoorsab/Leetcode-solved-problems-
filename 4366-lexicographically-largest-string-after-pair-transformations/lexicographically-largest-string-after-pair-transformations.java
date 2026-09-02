class Solution {
    public String[] largestString(int[] nums) {
        int n=nums.length;
        String []res=new String[n];
        int z=1<<25;
        for(int i=0;i<n;i++){
            int x=nums[i];
            StringBuilder sb=new StringBuilder();
            int countZ=x/z;
                for(int k=0;k<countZ;k++){
                    sb.append('z');
                }
            int rem=x%z;
            for(int j=24;j>=0;j--){
                if(((rem>>j)&1)==1){
                    sb.append((char)('a'+j));
                }
                
            }
            res[i]=sb.toString();
        }
        return res;
    }
}