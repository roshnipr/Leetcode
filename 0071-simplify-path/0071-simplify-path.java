class Solution {
    public String simplifyPath(String path) {
        Stack<String> p=new Stack<>();
        String[] parts=path.split("/");
        for(String part:parts) {
            if(part.equals("")||part.equals(".")) {
                continue;
            } else if(part.equals("..")) {
                if(!p.isEmpty()) {
                    p.pop();
                }
            } else {
                p.push(part);
            }
        }
        StringBuilder res=new StringBuilder();
        for(String d:p) {
            res.append("/").append(d);
        }
        return res.length()==0?"/":res.toString();
    }
}