class Solution {
    public String reverseVowels(String s) {
        char[] copy=s.toCharArray();
        int left=0,right=copy.length-1;
        while(left<right) {
            while(left<right && !isvowel(copy[left])) {
                left++;
            }
            while(left<right && !isvowel(copy[right])) {
                right--;
            }
            char temp=copy[left];
            copy[left]=copy[right];
            copy[right]=temp;

            left++;
            right--;
        }
        return new String(copy);
    }
    private boolean isvowel(char c) {
        return "aeiouAEIOU".indexOf(c) !=-1;
    }
}