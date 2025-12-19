class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String[] words=text.split(" ");
        for(String word:words) {
            boolean yes=true;
            for(char ch:word.toCharArray()) {
                if(brokenLetters.indexOf(ch)!=-1) {
                    yes=false;
                    break;
                }
            }
            if(yes) {
                count++;
            }
        }
        return count;
    }
}