class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int fi=0;
        int si=1;
        for(int num:nums) {
            if(num>0) {
                arr[fi] =num;
                fi +=2;
            } else {
                arr[si] =num;
                si +=2;
            }
        }
        return arr;
    }
}