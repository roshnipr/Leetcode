class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] a=new int[26];

        for(int i=0;i<s.length();i++) {
            a[s.charAt(i)-'a']=i;
        }
        int sum=0;
        for(int i=0;i<t.length();i++) {
            sum+=Math.abs(a[t.charAt(i)-'a' ]-i);       
            }
            return sum;
    }
}