class Solution {
    public String sortVowels(String s) {
        String v="aeiouAEIOU";
        char[] arr=s.toCharArray();

        ArrayList<Character> list=new ArrayList<>();
        for(char c:arr) {
            if(v.indexOf(c) !=-1) {
                list.add(c);
            }
        }
        Collections.sort(list);
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(v.indexOf(arr[i]) !=-1) {
                arr[i]=list.get(j++);
            }
        }
        return new String(arr);
    }
}