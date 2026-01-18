class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        List<String> groups=new ArrayList<>();
        int i=0;
        while(i<s.length()) {
            String group="";
            for(int j=0;j<k && i<s.length();j++,i++) {
                group+=s.charAt(i);
            }
            while(group.length()<k) {
                group+=fill;
            }
            groups.add(group);
        }
        return groups.toArray(new String[0]);
    }
}