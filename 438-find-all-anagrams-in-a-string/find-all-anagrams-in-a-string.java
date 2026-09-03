class Solution {
    public static boolean func(HashMap<Character,Integer>map1,HashMap<Character,Integer>map){
        if(map1.size()!=map.size()){
            return false;
        }
        for(char key:map1.keySet()){
            if(!map.containsKey(key)) {
                return false;
            }
            int a=map.get(key);
            int b=map1.get(key);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<k;i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int l=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            if(r-l==k){
                char chl=s.charAt(l);
                map1.put(chl,map1.get(chl)-1);
                if(map1.get(chl)==0) map1.remove(chl);
            l++;
            }
            if(r-l+1==k){
                boolean valid=func(map1,map);
                if(valid) list.add(l);
            }
        }
        return list;

    }
}