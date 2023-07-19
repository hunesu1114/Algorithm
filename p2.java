class Solution {
    public int solution(int n) {
        int answer = n;
        int tempN=n;
        int tempAns=answer;
        int cntOfN=0;
        int cntOfAns=0;
        while(tempN!=0){
            if(tempN%2==1){
                cntOfN++;
            } tempN/=2;
        }
        
        while(true){
            tempAns=++answer;
            while(tempAns!=0){
                if(tempAns%2==1){
                    cntOfAns++;
                } tempAns/=2;
            }
            if(cntOfAns==cntOfN){
                return answer;
            } else{
                cntOfAns=0;
            }
        }
    }
}
