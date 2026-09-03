class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // Track frequency of all A-Z characters
        int l = 0;
        int maxCount = 0;
        int maxLen = 0;
        
        for (int r = 0; r < s.length(); r++) {
            counts[s.charAt(r) - 'A']++;
            
            maxCount = Math.max(maxCount, counts[s.charAt(r) - 'A']);
            
            while ((r - l + 1) - maxCount > k) {
                counts[s.charAt(l) - 'A']--;
                l++; // Correctly move the left pointer forward
            }
            
            // Update the maximum window length found so far
            maxLen = Math.max(maxLen, r - l + 1);
        }
        
        return maxLen;
    }
}