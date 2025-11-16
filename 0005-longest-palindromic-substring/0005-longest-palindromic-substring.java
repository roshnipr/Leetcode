class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0;i<s.length();i++) {
            String odd=expandFromCenter(s,i,i);

            if(odd.length()>longest.length()) {
                longest=odd;
            }
            String even=expandFromCenter(s,i,i+1);
            if(even.length()>longest.length()) {
                longest=even;
            }
        }
        return longest;
    }
        private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Substring between the last matching characters
        return s.substring(left + 1, right);
    }
}