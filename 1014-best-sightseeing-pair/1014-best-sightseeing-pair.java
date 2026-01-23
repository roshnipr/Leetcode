class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int inibest=values[0];
        int beauty=0;

        for(int j=1;j<values.length;j++) {
            int currscore=inibest+values[j]-j;
            beauty=Math.max(beauty,currscore);
            inibest=Math.max(inibest,values[j]+j);
        }
        return beauty;
    }
}