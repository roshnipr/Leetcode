class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> r=new HashSet<>();
        for(int num:nums) {
            r.add(num);
        } while(r.contains(original)) {
            original=2*original;
        }
        return original;
    }
}