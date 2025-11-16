import java.util.*;
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int[] even=new int[(n+1)/2];
        Integer[] odd=new Integer[n/2];

        for(int i=0;i<n;i++) {
            if(i%2==0) even[i/2]=nums[i];
            else odd[i/2]=nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd,Collections.reverseOrder());

        for(int i=0;i<n;i++) {
            nums[i]=(i%2==0) ?even[i/2]:odd[i/2];
        }
        return nums;
    }
}