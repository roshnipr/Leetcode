class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++) {
        Set<Integer> es=new HashSet<>();
        Set<Integer> os=new HashSet<>();

        for(int j=i;j<n;j++) {
            if(nums[j]%2==0) {
                es.add(nums[j]);
            } else {
                os.add(nums[j]);
            } if(es.size()==os.size()) {
                res=Math.max(res,j-i+1);
            }
        }
        }
        return res;
    }
}