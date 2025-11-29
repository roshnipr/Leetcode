class Solution {
    public int[][] generateMatrix(int num) {
        int[][]r=new int[num][num];
        int n=1;
        int top=0;
        int bottom=num-1;
        int right=num-1;
        int left=0;
        while(top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) {
                r[top][i]=n++;
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                r[i][right]=n++;
            }
            right--;
            if(right>=left) {
                for(int i=right;i>=left;i--){
                    r[bottom][i]=n++;
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                    r[i][left]=n++;
                }
                left++;
            }
        }
        return r;
    }
}