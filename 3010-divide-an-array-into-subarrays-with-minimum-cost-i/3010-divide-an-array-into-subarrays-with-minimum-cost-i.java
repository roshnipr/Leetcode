class Solution {
    public int minimumCost(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=1;i<=n-2;i++) {
            for(int j=i+1;j<=n-1;j++) {
                ans=Math.min(ans,nums[0]+nums[i]+nums[j]);
            }
        }
        return ans;
    }
}