class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        int n=s.length()/2;
        for(int i=0;i<n;i++) {
            if(isvowel(s.charAt(i))) count1++;
        }
        for(int i= n;i<s.length();i++) {
            if(isvowel(s.charAt(i))) count2++;
        }
        return count1==count2;
    }
    private boolean isvowel(char c) {
        return "aeiouAEIOU".indexOf(c) !=-1;
    }
}