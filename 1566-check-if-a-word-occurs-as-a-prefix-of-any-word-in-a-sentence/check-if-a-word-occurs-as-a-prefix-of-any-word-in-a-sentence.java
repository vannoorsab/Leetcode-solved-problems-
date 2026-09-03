class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
    
        int count=0;
        for(String  ch:sentence.split(" ")){
            if(ch.startsWith(searchWord)){
                return count+1;
            }
            count++;
        }
        return -1;

    }
}