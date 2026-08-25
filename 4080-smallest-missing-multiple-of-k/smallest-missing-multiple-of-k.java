class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>list=new HashSet<>();
        for(int num:nums){
            list.add(num);
        }
        int count=k;
        while(list.contains(count)){
            count+=k;
        }
        return count;
    }
}