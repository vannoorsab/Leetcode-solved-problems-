class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        for (int i = tri.size() - 2; i >= 0; i--) {
            for (int j = 0; j < tri.get(i).size(); j++) {
                int val = Math.min(
                        tri.get(i).get(j) + tri.get(i + 1).get(j),
                        tri.get(i).get(j) + tri.get(i + 1).get(j + 1));
                tri.get(i).set(j, val);
            }
        }
        
        return tri.get(0).get(0);
    }
}