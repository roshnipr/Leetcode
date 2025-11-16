class Solution {
    public int maxSubArray(int[] nums) {
        int maxs=nums[0];
        int curs=nums[0];
        for(int i=1;i<nums.length;i++) {
            curs=Math.max(nums[i],curs+nums[i]);
            maxs=Math.max(maxs,curs);
        }
        return maxs;
    }
}