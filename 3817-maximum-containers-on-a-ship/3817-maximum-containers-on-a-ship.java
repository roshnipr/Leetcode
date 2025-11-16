class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int tc=n*n;
        int mw=maxWeight/w;

        return Math.min(tc,mw);
    }
}