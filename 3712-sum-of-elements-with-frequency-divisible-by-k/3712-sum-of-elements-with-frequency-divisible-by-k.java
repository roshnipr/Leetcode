class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n:nums) {
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(int n:freq.keySet()) {
            int count=freq.get(n);
            if(count%k==0) {
                sum+=n*count;
            }
        }
        return sum;
    }
}