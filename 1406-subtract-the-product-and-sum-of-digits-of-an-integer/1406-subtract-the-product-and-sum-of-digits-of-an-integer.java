class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1,digit=0;
        while(n>0) {
            digit = n%10;
            s += digit;
            p *= digit;
            n/=10;
        }
        return p-s;
    }
}