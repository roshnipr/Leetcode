class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int tt=0;
        for(int i=0;i<tickets.length;i++) {
            if(i<=k) {
                tt+=Math.min(tickets[i],tickets[k]);
            } else {
            tt+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        return tt;
    }
}