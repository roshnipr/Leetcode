class Solution {
    public int titleToNumber(String columnTitle) {
        int r=0;
        for(int i=0;i<columnTitle.length();i++) {
            int c=columnTitle.charAt(i)-65+1;
            r=r*26+c;
        }
        return r;
    }
}