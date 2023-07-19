class Solution
{
    public int solution(String s)
    {
        StringBuilder sb=new StringBuilder();
        boolean deleted=true;
        int sLen=s.length();
        int cnt=0;
        while(cnt<sLen){
            sb.append(s.charAt(cnt));
            int sbLen=sb.length();
            if(sbLen>1&&sb.charAt(sbLen-2)==sb.charAt(sbLen-1)){
                sb.delete(sbLen-2,sbLen);
            }
            cnt++;
        }
        if(sb.length()==0){
            return 1;
        } else{
            return 0;
        }
    }
}
