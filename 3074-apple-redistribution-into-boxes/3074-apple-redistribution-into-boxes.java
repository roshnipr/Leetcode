class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int tapples=0;
        for(int a:apple) {
            tapples+=a;
        }
        Arrays.sort(capacity);
        int rbox=0;
        int rcap=0;
        for(int i=capacity.length-1;i>=0;i--) {
             rcap+=capacity[i];
             rbox++;

             if(tapples<=rcap) {
                return rbox;
             }
        }
        return rbox;
    }
}