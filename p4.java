import java.util.*;

class Solution {
    public String solution(String s) {
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
