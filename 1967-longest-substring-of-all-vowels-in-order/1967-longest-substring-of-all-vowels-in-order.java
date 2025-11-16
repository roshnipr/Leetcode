class Solution {
    public int longestBeautifulSubstring(String word) {
        int mx=0;
        int count=1;
        int vg=1;
        for(int i=1;i<word.length();i++) {
            char prev=word.charAt(i-1);
            char curr=word.charAt(i);

            if(curr == prev) {
                count++;
            } else if ((prev == 'a' && curr == 'e')
                || (prev == 'e' && curr == 'i') 
                || (prev == 'i' && curr == 'o')
                || (prev == 'o' && curr == 'u')) {
                    vg++;
                    count++;
                    } else {
                        count =1;
                        vg=1;
                        }
                        if(vg == 5 && count>mx) {
                            mx=count;
                            }
                        }
                        return mx;
    }
}