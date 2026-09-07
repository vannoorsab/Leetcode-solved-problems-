class Solution {
    private void reverse(int []nums,int left,int right){
        while(left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        //right rotations
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        //left roatations
        /*reverse(nums,k,nums.lenght-1);
        reverse(nums,0,k-1);
        reverse(nums,0,nums.length);*/
    }
}