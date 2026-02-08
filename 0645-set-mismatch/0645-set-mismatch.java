class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] count=new int[n+1];
        for(int no:nums) {
            count[no]++;
        }
        int dupe=-1;
        int miss=-1;
        for(int i=1;i<=n;i++) {
            if(count[i]==2) {
                dupe=i;
            } else if(count[i]==0) {
                miss=i;
            }
        }
        return new int[]{dupe,miss};
    }
}