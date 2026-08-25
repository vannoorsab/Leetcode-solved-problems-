class Solution {
    public int longestSubarray(int[] nums, int k) {
        Map<Integer,List<Integer>>fact=new HashMap<>();
        for(int num:nums){
            if(!fact.containsKey(num)){
                List<Integer>list=new ArrayList<>();
                int n=num;
                for(int p=2;p*p<=n;p++){
                    if(n%p==0){
                        list.add(p);
                        while(n%p==0)
                            {
                                n/=p;
                            }
                    }
                }
                if(n>1){
                    list.add(n);
                }
                fact.put(num,list);
            }
        }
        Map<Integer,Integer>hm=new HashMap<>();
        int l=0;
        int d=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            for(int p:fact.get(nums[r])){
                if(hm.getOrDefault(p,0)==0){
                    d++;
                }
                hm.put(p,hm.getOrDefault(p,0)+1);
            }
            while(d>k){
                for(int p:fact.get(nums[l])){
                    hm.put(p,hm.get(p)-1);
                    if(hm.get(p)==0){
                        hm.remove(p);
                        d--;
                    }
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}