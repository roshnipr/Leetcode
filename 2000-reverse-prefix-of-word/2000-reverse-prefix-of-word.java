class Solution {
    public String reversePrefix(String word, char ch) {
        int rev=word.indexOf(ch);
        if(rev==-1) return word;
        StringBuilder sb=new StringBuilder(word.substring(0,rev+1));
        sb.reverse();
        sb.append(word.substring(rev+1));
        return sb.toString();
    }
}