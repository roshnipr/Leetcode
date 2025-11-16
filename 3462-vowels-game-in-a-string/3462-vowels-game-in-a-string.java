class Solution {
    public boolean doesAliceWin(String s) {
        String vow="aeiou";
        for(char ch:s.toCharArray()) {
            if(vow.indexOf(ch)!=-1) {
                return true;
            }
        }
        return false;
    }
}