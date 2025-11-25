class Solution {
    public int largestAltitude(int[] gain) {
        int mg=0;
        int gn=0;
        for(int g:gain) {
            gn += g;
            if(mg<gn) {
                mg=gn;
            }
        }
        return mg;
    }
}