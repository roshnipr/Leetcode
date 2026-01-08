class Solution {
    public int findClosestNumber(int[] nums) {
        int close=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(Math.abs(nums[i])<Math.abs(close) || Math.abs(nums[i])==Math.abs(close) && nums[i]>close) {
                close=nums[i];
            }
        }
        return close;
    }
}