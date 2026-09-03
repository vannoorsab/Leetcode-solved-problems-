class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        TreeSet<Long> sortedSet = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Check for any number in the range [nums[i] - valueDiff, nums[i] + valueDiff]
            Long floor = sortedSet.floor((long) nums[i] + valueDiff);
            if (floor != null && floor >= (long) nums[i] - valueDiff) {
                return true;
            }

            // Add current number to the set
            sortedSet.add((long) nums[i]);

            // Remove the number that is out of the indexDiff range
            if (i >= indexDiff) {
                sortedSet.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }

}