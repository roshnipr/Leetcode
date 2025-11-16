class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];

        for(char c:s.toCharArray()) {
            freq[c-'a']++;
        }
        int maxv=Integer.MIN_VALUE;
        int minv=Integer.MAX_VALUE;

        for(int c:freq) {
            if(c==0) continue;

            if(c%2==1) {
                maxv=Math.max(maxv,c);
            }
            if(c%2==0) {
                minv=Math.min(minv,c);
            }
        }
        return maxv-minv;
    }
}