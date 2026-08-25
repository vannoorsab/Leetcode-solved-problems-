
class Solution {
    private static class Query {
        int l, r, id, block;

        Query(int l, int r, int id, int blockSize) {
            this.l = l;
            this.r = r;
            this.id = id;
            this.block = l / blockSize;
        }
    }

    public boolean[] validSubarrays(int[] nums, int k, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        boolean[] ans = new boolean[q];

        int blockSize = (int) Math.sqrt(n) + 1;
        Query[] sortedQueries = new Query[q];
        for (int i = 0; i < q; i++) {
            sortedQueries[i] = new Query(queries[i][0], queries[i][1], i, blockSize);
        }

        // Mo's Algorithm Sorting
        Arrays.sort(sortedQueries, (a, b) -> {
            if (a.block != b.block) {
                return Integer.compare(a.block, b.block);
            }
            return (a.block % 2 == 0) ? Integer.compare(a.r, b.r) : Integer.compare(b.r, a.r);
        });

        // Find max value in nums to size the frequency array efficiently
        int maxVal = 0;
        for (int val : nums) {
            maxVal = Math.max(maxVal, val);
        }

        int[] freq = new int[maxVal + 1];
        int distinctCount = 0;
        int oddCount = 0;

        int curL = 0;
        int curR = -1;

        for (Query query : sortedQueries) {
            int L = query.l;
            int R = query.r;

            // Expand / shrink range to match [L, R]
            while (curR < R) {
                curR++;
                int x = nums[curR];
                if (freq[x] == 0) distinctCount++;
                if (freq[x] % 2 == 1) oddCount--;
                else oddCount++;
                freq[x]++;
            }
            while (curR > R) {
                int x = nums[curR];
                freq[x]--;
                if (freq[x] == 0) distinctCount--;
                if (freq[x] % 2 == 1) oddCount++;
                else oddCount--;
                curR--;
            }
            while (curL < L) {
                int x = nums[curL];
                freq[x]--;
                if (freq[x] == 0) distinctCount--;
                if (freq[x] % 2 == 1) oddCount++;
                else oddCount--;
                curL++;
            }
            while (curL > L) {
                curL--;
                int x = nums[curL];
                if (freq[x] == 0) distinctCount++;
                if (freq[x] % 2 == 1) oddCount--;
                else oddCount++;
                freq[x]++;
            }

            ans[query.id] = (distinctCount == k) && (oddCount == 0);
        }

        return ans;
    }
}