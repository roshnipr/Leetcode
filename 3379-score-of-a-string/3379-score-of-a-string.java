class Solution {
    public int scoreOfString(String s) {
        int sv=0;
        for(int i=1;i<s.length();i++) {
            int diff=Math.abs(s.charAt(i)-s.charAt(i-1));
            sv+=diff;
        }
        return sv;
    }
}