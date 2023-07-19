import java.util.*;

class Solution {
    public long solution(int n) {
        //같은것을 포함한 순열 -> 실패 (숫자 너무 커져서 오류)
        //DP이용 -> 피보나치 수열
        //arr=피보나치 수열(arr.get(0)은 무시)
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        
        ArrayList<Long> arr=new ArrayList<>();
        arr.add(0L);
        arr.add(1L); //초깃값(n=1)
        arr.add(2L); //초깃값(n=2)
        for(int i=3;i<=n;i++){
            //숫자가 너무 커지기 때문에 페르마 소정리 사용
            arr.add((arr.get(i-2)+arr.get(i-1))%1234567);
        }
        return arr.get(n);
    }
}
