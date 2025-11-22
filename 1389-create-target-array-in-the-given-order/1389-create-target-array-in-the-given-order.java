class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> r= new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            r.add(index[i],nums[i]);
        }
        int[] result=new int[nums.length];
        for(int i=0;i<r.size();i++) {
            result[i]=r.get(i);
        }
        return result;
    }
}