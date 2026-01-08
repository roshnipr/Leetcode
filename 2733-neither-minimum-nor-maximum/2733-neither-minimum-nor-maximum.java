class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3) {
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums) {
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        for(int num:nums) {
            if(num!=min && num!=max) {
                return num;
            }
        }
        return -1;
    }
}