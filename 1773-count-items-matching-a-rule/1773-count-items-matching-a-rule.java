class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int in=0;
        if(ruleKey.equals("color")) {
            in=1;
        }
        else if(ruleKey.equals("name")) {
            in=2;
        }
        int count=0;
        for(List<String> item:items) {
            if(item.get(in).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}