class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int key:map.keySet()){
        if(map.get(key)==2){
            result.add(key);
        }
     
            }
        return new int[]{ result.get(0),result.get(1)};
        
    }
}