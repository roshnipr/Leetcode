class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums) {
            if(!hs.add(num)) {
                return num;
            }
        }
        return -1;
    }
}