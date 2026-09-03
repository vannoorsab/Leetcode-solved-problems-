class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] prefixCounts = new int[nums.length + 1];
        prefixCounts[0] = 1; // 0 odd numbers seen initially
        
        int currentOdds = 0;
        int totalSubarrays = 0;
        
        for (int num : nums) {
            if (num % 2 != 0) {
                currentOdds++;
            }
            
            if (currentOdds >= k) {
                totalSubarrays += prefixCounts[currentOdds - k];
            }
            
            prefixCounts[currentOdds]++;
        }
        
        return totalSubarrays;
    }
}