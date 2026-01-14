class Solution {
    public String convertDateToBinary(String date) {
        String[] parts=date.split("-");

        int year=Integer.parseInt(parts[0]);
        int mon=Integer.parseInt(parts[1]);
        int day=Integer.parseInt(parts[2]);

        return tobinary(year)+"-"+tobinary(mon)+"-"+tobinary(day);
        }
        private String tobinary(int n) {
            StringBuilder sb=new StringBuilder();
            while(n>0) {
                sb.append(n%2);
                n/=2;
            }
            return sb.reverse().toString();
    }
}