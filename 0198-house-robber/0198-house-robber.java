class Solution {
    public int rob(int[] nums) {
        int p=0,c=0;
        for (int num:nums) {
            int temp=c;
            c=Math.max(c,p+num);
            p=temp;
        }
        return c;
    }
}