class Solution {
    public boolean stoneGame(int[] piles) {
        int oddsum=0;
        int evensum=0;

        for(int i=0;i<piles.length;i++) {
            if(i%2==0) {
                evensum+=piles[i];
            }  else {
                oddsum+=piles[i];
            }
        }
        return evensum!=oddsum;
    }
}