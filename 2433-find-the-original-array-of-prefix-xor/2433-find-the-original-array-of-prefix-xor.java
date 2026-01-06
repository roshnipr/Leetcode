class Solution {
    public int[] findArray(int[] pref) {
        int l=pref.length;
        int[] result=new int[l];
        result[0]=pref[0];
        for(int i=1;i<l;i++) {
            result[i]=pref[i]^pref[i-1];
        }
        return result;
    }
}