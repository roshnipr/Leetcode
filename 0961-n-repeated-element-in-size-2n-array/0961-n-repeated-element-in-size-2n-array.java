class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int[] freq=new int[10001];
        for(int num:nums) {
            freq[num]++;
            if(freq[num]==n) {
                return num;
            }
        }
        return -1;
    }
}