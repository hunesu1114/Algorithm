import java.util.*;

public class Solution {
    public int solution(int n) {
        //홀수 -= 1 -> /=2
        //짝수 /=2
        int ans = 0;

        while(n!=1){
            if(n%2==1){
                n-=1;
                ans++;
            } 
            n/=2;
        }
        return ++ans;
    }
}
