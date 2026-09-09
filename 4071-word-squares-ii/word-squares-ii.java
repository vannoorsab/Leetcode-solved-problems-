class Solution {
    public List<List<String>> wordSquares(String[] words) {
         String[] sori=words;
        int n=sori.length;
        List<List<String>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i) continue;
                for(int k=0;k<n;k++){
                    if(k==i||k==j) continue;
                    for(int l=0;l<n;l++){
                        if(l==i||l==j||l==k) continue;
                        String top=sori[i];
                        String left=sori[j];
                        String right=sori[k];
                        String bottom=sori[l];
                        if(top.charAt(0)==left.charAt(0)&&top.charAt(3)==right.charAt(0)&&bottom.charAt(0)==left.charAt(3)&&bottom.charAt(3)==right.charAt(3)){
                            result.add(Arrays.asList(top,left,right,bottom));
                        }
                    }
                }
            }
        }
        result.sort((a,b) ->{
            for(int i=0;i<4;i++){
                int cmp=a.get(i).compareTo(b.get(i));
                if(cmp!=0)return cmp;
            }
            return 0;
        });
        return result;
            }
        }
    