class Solution {
    public String freqAlphabets(String s) {
        StringBuilder r=new StringBuilder();
        int i=0;

        while(i<s.length()) {
            if(i+2<s.length() && s.charAt(i+2)=='#') {
                int num=Integer.parseInt(s.substring(i,i+2));
                r.append((char)('a' +num-1));
                i+=3;
            } else {
                int num=s.charAt(i)-'0';
                r.append((char)('a' +num-1));
                i++;
            }
        }
        return r.toString();
    }
}