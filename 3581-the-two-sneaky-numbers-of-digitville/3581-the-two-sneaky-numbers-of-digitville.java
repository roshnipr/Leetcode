class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> repeat=new HashSet<>();
        int result[]=new int[2];
        int i=0;
        for(int num:nums) {
            if(!repeat.add(num)){
                result[i++]=num;
            }
        }
        return result;
    }
}