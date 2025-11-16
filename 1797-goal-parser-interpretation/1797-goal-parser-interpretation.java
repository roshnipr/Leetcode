class Solution {
    public String interpret(String command) {
        StringBuilder r=new StringBuilder();
        for(int i=0;i<command.length();i++) {
            if(command.charAt(i)=='G') {
                r.append("G");
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                r.append("o");
                i++;
            } else {
                r.append("al");
                i+=3;
            }
        }
        return r.toString();
    }
}