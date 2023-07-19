class Solution {
    public int solution(int n) {
        int answer = 1;
        int startIdx=1;
        int endIdx=1;
        int sum=1;
        while(endIdx!=n){
            if(sum==n){
                answer++;
                endIdx++;
                sum+=endIdx;
            } else if(sum<n){
                endIdx++;
                sum+=endIdx;
            } else{
                sum-=startIdx;
                startIdx++;
            }
        }
        return answer;
    }
}
