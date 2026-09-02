class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>count=new HashMap<>();
        Map<Integer,Integer>first=new HashMap<>();
        Map<Integer,Integer>last=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            count.put(num,count.getOrDefault(num,0)+1);
            if(!first.containsKey(num)){
                first.put(num,i);
            }
            last.put(num,i);
        }
        int scount=0;
        for(int num:count.keySet()){
            int a=count.get(num);
            int e=last.get(num)-first.get(num)+1;
            if(a==e){
                scount++;
            }
        }
        return scount;
    }
}