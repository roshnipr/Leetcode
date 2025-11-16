class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set <Character> jset=new HashSet();
        for(char j:jewels.toCharArray()) {
            jset.add(j);
        }
        int count=0;
        for(char j:stones.toCharArray()) {
            if(jset.contains(j)) {
                count++;
            }
        }
        return count;
    }
}