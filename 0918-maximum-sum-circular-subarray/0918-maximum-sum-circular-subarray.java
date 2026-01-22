class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totsum=0;
        int maxsum=nums[0],currmax=0;
        int minsum=nums[0],currmin=0;

        for(int num:nums) {
            currmax=Math.max(currmax+num,num);
            maxsum=Math.max(maxsum,currmax);

            currmin=Math.min(currmin+num,num);
            minsum=Math.min(minsum,currmin);

            totsum+=num;
        }
        if(maxsum<0) {
            return maxsum;
        }
        return Math.max(maxsum,totsum-minsum);
    }
}