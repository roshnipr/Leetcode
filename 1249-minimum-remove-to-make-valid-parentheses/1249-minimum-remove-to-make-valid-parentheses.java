class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder fp=new StringBuilder();
        int open=0;

        for(char c:s.toCharArray()) {
            if(c=='(') {
                    open++;
                    fp.append(c);
                } else if(c==')') {
                    if(open>0) {
                    open--;
                    fp.append(c);
                }
            } else {
                fp.append(c);
            }
        }
        StringBuilder r=new StringBuilder();
        int close=0;
        for(int i=fp.length()-1;i>=0;i--) {
            char c=fp.charAt(i);
            if(c==')') {
                close++;
                r.append(c);
            } else if(c=='(') {
                if(close>0) {
                    close--;
                    r.append(c);
                }
            } else {
                r.append(c);
            }
        }
        return r.reverse().toString();
    }
}