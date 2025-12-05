class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zerosaw=false;
        for(char c:s.toCharArray()) {
            if(c=='0') zerosaw=true;
            else if(zerosaw) return false;
        }
        return true;
    }
}