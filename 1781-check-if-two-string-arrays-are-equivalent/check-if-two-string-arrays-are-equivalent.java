class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1=String.join("",word1);
        String res2=String.join("",word2);
        return res1.equals(res2);
        
    }
}