class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=0;
        for(int candy:candies) {
            if(candy>m) m=candy;
        }
        List<Boolean> r= new ArrayList<>();
        for(int candy:candies) {
            if(candy+extraCandies >= m) {
                r.add(true);
            } else {
                r.add(false);
            }
        }
        return r;
    }
}