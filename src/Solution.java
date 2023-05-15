import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Solution {
    public int[] solution(String my_string) {
        StringBuilder sb=new StringBuilder();
        int length=my_string.length();
        for(int i=0;i<length;i++){
            if(Character.getNumericValue(my_string.charAt(i))<10){
                sb.append(my_string.charAt(i));
            }
        }
        int newLength=sb.length();
        int[] answer=new int[newLength];
        for(int i=0;i<newLength;i++){
            answer[i]=Character.getNumericValue(sb.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }

    public String solution1(int age) {
        int exp=3;
        StringBuilder answer=new StringBuilder();
        while(true){
            if((int)(age/Math.pow(10,exp))==0){
                exp-=1;
                continue;
            }
            break;
        }
        while(exp>=0){
            int i=(int)(age/Math.pow(10,exp));
            answer.append((char)('a'+i));
            age-=i*Math.pow(10,exp);
            exp-=1;
        }
        return answer.toString();
    }

    public int solution2(int num, int k) {
        int answer = -1;
        int length=7;
        int pos=1;
        while(length!=0){
            if(num/(int)(Math.pow(10,length-1))!=0){
                System.out.println((int)(Math.pow(10,length-1)));
                break;
            }
            length--;
        }

        while(true){
            if(num/(int)(Math.pow(10,length-pos))==k){
                answer=pos;
                break;
            }
            num=num%(int)(Math.pow(10,length-pos));
            pos++;
        }
        return answer;
    }

    public long solution3(int a, int b) {
        long answer = 0;
        if(a==b) {
            return a;
        }
        int max=a>b?a:b;
        int min=a<b?a:b;
        while(max!=min){
            answer+=min;
            min++;
        }
        return answer+max;
    }

    public int solution4(int num) {
        //중간에 int 범위 넘어가서 마이너스 됨
        int cnt=0;
        long longNum=num;
        while(longNum!=1){
            if(cnt==500) {
                cnt=-1;
                break;
            }
            if(longNum%2==0){
                num/=2;
                cnt++;
                continue;
            } else {
                longNum=(longNum*3)+1;
                cnt++;
                continue;
            }

        }
        return cnt;
    }

    public String solution5(String[] seoul) {
        int x=0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i]=="Kim"){
                x=i;
            }
        }
        return "김서방은 "+x+"에 있다";
    }

    public String solution5(String s) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Character> arr=new ArrayList<>();
        int length=s.length();

        for(int i=0;i<length;i++){
            arr.add(s.charAt(i));
        }

        Collections.sort(arr);
        for(int i=length-1;i>=0;i--){
            answer.append(arr.get(i));
        }
        return answer.toString();
    }

    public String solution6(String s){
            StringBuilder sb=new StringBuilder(s);
            int length=sb.length();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<length;i++){
                if(sb.charAt(i)==' '){
                    continue;
                } else if(sb.charAt(i)=='-'){
                    int start=i;
                    while(true){
                        if(i==length-1){
                            arr.add(Integer.parseInt(sb.substring(start,i+1)));
                            break;
                        }
                        i++;

                        if(sb.charAt(i)!=' '){
                            continue;
                        } else {
                            arr.add(Integer.parseInt(sb.substring(start,i)));
                            break;
                        }
                    }
                } else{
                    int start=i;
                    while(true){
                        if(i==length-1){
                            arr.add(Integer.parseInt(sb.substring(start,i+1)));
                            break;
                        }
                        i++;

                        if(sb.charAt(i)!=' '){
                            continue;
                        } else {
                            arr.add(Integer.parseInt(sb.substring(start,i)));
                            break;
                        }
                    }
                }
            }
            int arrLength=arr.size();
            Collections.sort(arr);
            String min=Integer.toString(arr.get(0));
            String max=Integer.toString(arr.get(arrLength-1));
            String answer=min+' '+max;
            return answer;
        }

        
}
