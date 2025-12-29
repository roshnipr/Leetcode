class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count=new int[121];
        for(int a:ages) {
            count[a]++;
        }
        int req=0;
        for(int agea=1;agea<=120;agea++) {
            if(count[agea]==0) continue;

            for(int ageb=1;ageb<=120;ageb++) {
                if(count[ageb]==0) continue;
                if(ageb<=agea/2+7) continue;
                if(ageb>agea) continue;
                
                req+=count[agea]*count[ageb];
                if(agea==ageb) {
                    req-=count[agea];
                }
            }
        }
        return req;
    }
}