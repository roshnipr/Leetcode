class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totbottles= numBottles;
        int empty=numBottles;

        while (empty >= numExchange) {
            int newFull = empty / numExchange;
            totbottles += newFull;
            empty = empty % numExchange + newFull;
        }
        return totbottles;
    }
}