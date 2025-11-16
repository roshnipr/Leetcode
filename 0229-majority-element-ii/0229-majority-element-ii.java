class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0;
        int n1=0,n2=1;

        for(int num:nums) {
            if(n1==num) {
                count1++;
            } else if(n2==num) {
                count2++;
            } else if(count1==0) {
                n1=num;
                count1++;
            } else if(count2==0) {
                n2=num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums) {
            if(num==n1) count1++;
            else if(num==n2) count2++;
        }
        List<Integer> result= new ArrayList<>();
        int n=nums.length;

        if(count1>n/3) result.add(n1);
        if(count2>n/3) result.add(n2);
        return result;
    }
}