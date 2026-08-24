class Solution {
     int pos=-1;
    private int Leftsearch1(int []nums,int target){
        int low=0;
        int high=nums.length-1;
while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                 pos=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return pos;
           
    }
    private int rightsearch(int []nums,int target){
        int low=0;
        int high=nums.length-1;
while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                 pos=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return pos;
           
    }
    public int[] searchRange(int[] nums, int target) {
        int Findex=Leftsearch1(nums,target);
        int Lindex=rightsearch(nums,target);
            return new int[]{Findex,Lindex};
        
        
    }
}