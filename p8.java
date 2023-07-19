import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int g;
        int answer=arr[0];
        for(int i=1;i<arr.length;i++){
            g=gcd(answer,arr[i]);
            answer=answer*arr[i]/g;
        }
        return answer;
    }
    
    public int gcd(int a, int b){
        if(a>=b){
            return a%b==0?b:gcd(b,a%b);
        } else{
            return b%a==0?a:gcd(a,b%a);
        }
    }
}
