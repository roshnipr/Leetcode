class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] r=new int[n];
        for(int i=0;i<n;i++) {
            int c=0;
            for(int j=0;j<nums.length;j++) {
                if(nums[j] < nums[i]) {
                    c++;
                }
            }
            r[i]=c;
        }
        return r;
    }
}