class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);

        int maxn=1;
        int left=0;
        for(int right=0;right<n;right++) {
            while((long) nums[right]>(long)nums[left]*k) {
                left++;
            }
            maxn=Math.max(maxn,right-left+1);
        }
        return n-maxn;
    }
}