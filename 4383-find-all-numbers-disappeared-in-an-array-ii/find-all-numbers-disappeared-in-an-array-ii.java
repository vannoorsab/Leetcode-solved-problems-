class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>>list=new ArrayList<>();
    HashSet<Integer>hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
    int i=lower;
        while(i<=upper){
            if(hs.contains(i)){
                i++;
                continue;
            }
            int st=i;
            while(i<=upper&&!hs.contains(i)){
                i++;
            }
            list.add(Arrays.asList(st,i-1));
        }
        return list;
    }
}