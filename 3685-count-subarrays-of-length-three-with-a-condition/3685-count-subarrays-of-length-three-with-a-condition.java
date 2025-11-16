class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length-3;i++) {
            int n1=nums[i];
            int n2=nums[i+1];
            int n3=nums[i+2];
            if(n2%2==0 && n1 + n3 == n2/2) {
                count++;
            }
        }
        return count;
    }
}