class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;

        boolean[] prime = new boolean[n];
        if (n > 2) {
            for (int i = 2; i < n; i++) prime[i] = true;

            for (int p = 2; p * p < n; p++) {
                if (prime[p]) {
                    for (int i = p * p; i < n; i += p) {
                        prime[i] = false;
                    }
                }
            }
        }

        long sumA = 0, sumB = 0;

        for (int i = 0; i < n; i++) {
            if (i >= 2 && prime[i]) {
                sumA += nums[i];
            } else {
                sumB += nums[i];
            }
        }

        return Math.abs(sumA - sumB);
    }
}