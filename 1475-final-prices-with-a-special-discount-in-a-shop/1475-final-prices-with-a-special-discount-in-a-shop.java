class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] ans=prices.clone();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++) {
            while(!s.isEmpty() && prices[s.peek()]>=prices[i]) {
                int inx=s.pop();
                ans[inx]=prices[inx]-prices[i];
            }
            s.push(i);
        }
        return ans;
    }
}