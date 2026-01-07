class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int i=0,j=0,k=0;
        int[] res=new int[a+b];
        while(i<a && j<b) {
            if(nums1[i]<nums2[j]) {
                res[k++]=nums1[i++];
            } else {
                res[k++]=nums2[j++];
            }
        }
        while(i<a) {
            res[k++]=nums1[i++];
        } while(j<b) {
            res[k++]=nums2[j++];
        }
        int d=res.length;

        if(d%2==1) {
            return res[d/2];
        } else {
            return (res[d/2-1] + res[d/2])/2.0;
        }
    }
}