class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i+=2) {
            int ap=nums[i];
            int bp=nums[i+1];

            res[j++]=bp;
            res[j++]=ap;
        }
        return res;
    }
}