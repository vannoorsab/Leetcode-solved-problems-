class Solution {
    public int sumFourDivisors(int[] nums) {
        int result = 0;

        for (int n : nums) {
            int sum = fourDivisorSum(n);
            result += sum;
        }

        return result;
    }

    private int fourDivisorSum(int n) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                sum += i;

                if (i != n / i) {
                    count++;
                    sum += n / i;
                }

                if (count > 4) return 0;
            }
        }

        return count == 4 ? sum : 0;
    }
}