class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] arr=new int[n];
        int j=0;
        for(int i=0;i<nums.length;i+=2) {
            int ap=nums[i];
            int bp=nums[i+1];

            arr[j++]=bp;
            arr[j++]=ap;
        }
        return arr;
    }
}