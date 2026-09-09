import java.util.Arrays;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] mapped = new int[n][2];

        for (int i = 0; i < n; i++) {
            mapped[i][0] = getMappedValue(mapping, nums[i]);
            mapped[i][1] = i; }

        Arrays.sort(mapped, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[mapped[i][1]];
        }
        return result;
    }

    private int getMappedValue(int[] mapping, int num) {
        if (num == 0) return mapping[0];
        
        int mappedVal = 0;
        int place = 1;
        
        while (num > 0) {
            int digit = num % 10;
            mappedVal += mapping[digit] * place;
            place *= 10;
            num /= 10;
        }
        return mappedVal;
    }
}