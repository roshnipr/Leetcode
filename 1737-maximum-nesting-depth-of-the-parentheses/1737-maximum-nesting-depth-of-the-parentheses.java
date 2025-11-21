class Solution {
    public int maxDepth(String s) {
        int cd=0;
        int md=0;
        for(char ch:s.toCharArray()) {
            if(ch=='('){
                cd++;
                md=Math.max(cd,md);
            }
            else if(ch==')') {
                cd--;
            }
        }
        return md;
    }
}