class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> ch=new HashMap<>();
        for(char c:s.toCharArray()) 
            ch.put(c,ch.getOrDefault(c,0)+1);
            List<Character> list=new ArrayList<>(ch.keySet());
            list.sort((a,b) -> Integer.compare(ch.get(b),ch.get(a)));
            StringBuilder sb=new StringBuilder();
            for(char c:list) 
            sb.append(String.valueOf(c).repeat(ch.get(c)));
            return sb.toString();
    }
}