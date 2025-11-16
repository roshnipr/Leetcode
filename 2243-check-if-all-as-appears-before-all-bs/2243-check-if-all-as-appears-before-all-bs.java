class Solution {
    public boolean checkString(String s) {
        boolean seen=false;

        for(char ch:s.toCharArray()) {
            if(ch=='b') {
                seen=true;
            } else if(seen && ch=='a') {
                return false;
            }
        }
        return true;
    }
}