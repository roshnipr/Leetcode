class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int temp=0;
        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);         
        } 
    public void reverse(int[] nums,int f,int end) {
        while(f<end) {
            int temp=nums[f];
            nums[f++] = nums[end];
            nums[end--] = temp;
        }
    }
}