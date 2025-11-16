class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();

        for(int num:nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int mfreq=0;
        for(int occ:freq.values()) {
            mfreq=Math.max(mfreq, occ);
        }
        int r=0;
        for(int occ:freq.values()) {
            if(occ==mfreq) {
                r +=occ;
            }
        }
        return r;
    }
}