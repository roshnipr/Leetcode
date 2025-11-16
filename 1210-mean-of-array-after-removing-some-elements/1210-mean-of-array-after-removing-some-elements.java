class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        int cut=(int)(n*0.05);

        int sum=0;

        for(int i=cut;i<n-cut;i++) {
            sum +=arr[i];
        }
        return (double) sum/(n-2 * cut);
    }
}