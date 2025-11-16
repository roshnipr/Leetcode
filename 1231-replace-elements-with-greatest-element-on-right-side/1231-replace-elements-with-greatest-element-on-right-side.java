class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ml=-1;
        for(int i=n-1;i>=0;i--) {
            int temp=arr[i];
            arr[i]=ml;
            ml=Math.max(ml,temp);
        }
        return arr;
    }
}