class Solution {
    public int sumFourDivisors(int[] nums) {
        int totsum=0;
        for(int num:nums) {
            totsum+=ds(num);
        }
        return totsum;
    }
    private int ds(int n) {
        int count=0;
        int sum=0;
        for(int i=1;i*i<=n;i++) {
            if(n%i==0) {
                count++;
                sum+=i;

                if(i!=n/i) {
                    count++;
                    sum+=n/i;
                }
                if(count>4) {
                    return 0;
                }
            }
        }
        return count==4?sum:0;
    }
}