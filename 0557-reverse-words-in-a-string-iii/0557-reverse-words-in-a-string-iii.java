class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        StringBuilder words=new StringBuilder();
        for(char ch:s.toCharArray()) {
            if(ch !=' ') {
                words.append(ch);
            } else {
                result.append(words.reverse());
                result.append(' ');
                words.setLength(0);
            }
        }
        result.append(words.reverse());
        return result.toString();
    }
}