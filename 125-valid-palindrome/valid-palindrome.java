class Solution {
    public boolean isPalindrome(String s) {
        String low=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rever=new StringBuilder(low).reverse().toString();
        return low.equals(rever);
    }
}