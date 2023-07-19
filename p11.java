class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int length=words.length;
        int cnt=0;
        boolean rule1=true;
        boolean rule2=true;
        
        while(cnt<length){
            if(cnt==0){
                cnt++;
                continue;
            }
            if(words[cnt].charAt(0)!=words[cnt-1].charAt(words[cnt-1].length()-1)){
                rule1=false;
                break;
            }
            
            for(int i=0;i<cnt;i++){
                if(words[cnt].equals(words[i])){
                    rule2=false;
                    break;
                }
            }
            if(!rule2){
                break;
            }
            
            
            cnt++;
            
        }
        
        if(rule1&&rule2){
            return answer;
        }
        cnt+=1;
        answer[0]=cnt%n==0?n:cnt%n;
        answer[1]=cnt%n==0?cnt/n:cnt/n+1;
        
        return answer;
    }
}
