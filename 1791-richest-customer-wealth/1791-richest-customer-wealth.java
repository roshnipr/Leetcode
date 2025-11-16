class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxw=0;
        for(int i=0;i<accounts.length;i++) {
            int w=0;

            for(int j=0;j<accounts[i].length;j++) {
                w += accounts[i][j];
            }
            if(w>maxw) {
                maxw=w;
            }
        }
        return maxw;
    }
}