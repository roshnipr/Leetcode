class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int c=0;c<2*s.length()-1;c++) {
            int l=c/2;
            int r=l+c%2;

            while(l>=0 && r<s.length() &&  s.charAt(l)==s.charAt(r)) {
                count++;
                l--;
                r++;
            }
        }
        return count;
    }
}