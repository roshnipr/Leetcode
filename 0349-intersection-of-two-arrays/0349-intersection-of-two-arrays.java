class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(int num:nums1) {
            s1.add(num);
        }
        Set<Integer> rs=new HashSet<>();
        for(int num:nums2) {
            if(s1.contains(num)) {
                rs.add(num);
            }
        }
        int[] r=new int[rs.size()];
        int i=0;
        for(int num:rs) {
            r[i++] = num;
        }
        return r;
    }
}