class Solution {
    public int numberOfWays(String corridor) {
        final int MOD=1_000_000_007;
        int seat=0;
        int plant=0;
        long ways=1;
        boolean cplant=false;

        for(char  ch:corridor.toCharArray()) {
            if(ch=='S') {
                seat++;
                
                if(seat%2==0) {
                    cplant=true;
                } else if(seat>2) {
                    ways=(ways*(plant+1)) %MOD;
                    plant=0;
                    cplant=false;
                }
            }
            else if(cplant) {
                plant++;
            }
        }
        return(seat>=2 && seat%2==0) ? (int)ways:0;
    }
}