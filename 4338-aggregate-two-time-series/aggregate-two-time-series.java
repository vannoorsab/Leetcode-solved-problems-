class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
   TreeSet<Integer>timestamps=new TreeSet<>();
        for(int []p:series1) timestamps.add(p[0]);
        for(int []p:series2) timestamps.add(p[0]);
        List<Integer>timelist=new ArrayList<>(timestamps);
        List<List<Integer>> result=new ArrayList<>();
        int i=series1.length-1;
        int j=series2.length-1;
        int val1=0;
        int val2=0;
        for(int k=timestamps.size()-1;k>=0;k--){
            int time =timelist.get(k);
            if(i>=0&&series1[i][0]==time){
                val1=series1[i][1];
                i--;
            }
            if(j>=0&&series2[j][0]==time){
                val2=series2[j][1];
                j--;
            }
            int sum=val1+val2;
            result.add(Arrays.asList(time,sum));
        }
        Collections. reverse(result);
        return result;
    }
}