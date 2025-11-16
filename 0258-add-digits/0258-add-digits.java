class Solution {
    public int addDigits(int num) {
        while (num >= 10) {  // keep going until num is a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // add the last digit
                num /= 10;        // remove the last digit
            }
            num = sum;  // repeat with the new sum
        }
        return num;  // num now contains the single digit result
        }
}