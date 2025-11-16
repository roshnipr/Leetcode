class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] marr=arr.clone();
        Arrays.sort(marr);
        
        Map<Integer,Integer> rankm=new HashMap<>();
        int rank=1;
        for(int num:marr) {
            if(!rankm.containsKey(num)) {
                rankm.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            arr[i]=rankm.get(arr[i]);
        } 
        return arr;
    }
}