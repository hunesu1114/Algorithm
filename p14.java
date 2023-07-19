class Solution {
    int solution(int[][] land) {
        //동적 계획법 -> k번째 행까지 도달했을 때, k번째 행의 원소를 그 원소에 이르기까지 최대 점수로 대체
        int answer = 0;
        int length=land.length;
        int cnt=1;
        while(cnt<=length-1){
            for(int i=0;i<4;i++){
                land[cnt][i]+=preRowBigElt(i,land[cnt-1]);
            }
            cnt++;
        }
        for(int i=0;i<4;i++){
            if(land[cnt-1][i]>answer){
                answer=land[cnt-1][i];
            }
        }
        return answer;
    }
    
    static int preRowBigElt(int colIdx, int[] preRow){
        int temp=0;
        for(int i=0;i<4;i++){
            if(i==colIdx){
                continue;
            }
            if(preRow[i]>=temp){
                temp=preRow[i];
            }
        }
        return temp;
    }
}
