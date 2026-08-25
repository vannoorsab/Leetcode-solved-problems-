class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary=new StringBuilder();
        for(char ch:s.toCharArray()){
    binary.append(String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0'));
        }
        return binary.toString().equals(binary.reverse().toString());
    }
}