class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> r=new ArrayList();
        Set<Integer> s=new HashSet();

        for(int i:nums) {
            s.add(i);
        }
        for(int j=1;j<=nums.length;j++) {
            if(!s.contains(j)) {
                r.add(j);
            } 
        }
        return r;
    }
}