class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) {
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) {
            rows[i]=new StringBuilder();
        }
        int cr=0;
        boolean mdown=true;

        for(int i=0;i<s.length();i++) {
            rows[cr].append(s.charAt(i));

            if(cr==0) {
                mdown=true;
            } else if(cr==numRows-1) {
                mdown=false;
            }
            if(mdown) {
                cr++;
            } else {
                cr--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<numRows;i++) {
            ans.append(rows[i]);
        }
        return ans.toString();
    }
}