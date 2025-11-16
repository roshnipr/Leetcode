class Solution {
    public int returnToBoundaryCount(int[] nums) {
       int steps=0;
       int bcount=0;

       for(int n:nums) {
        steps += n;
        if(steps==0) {
            bcount++;
        }
       } 
       return bcount;
    }
}