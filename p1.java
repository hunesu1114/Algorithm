import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayList<Character> arr=new ArrayList<>();
        int length=s.length();
        for(int i=0;i<length;i++){
            arr.add(s.charAt(i));
            if(arr.size()>1&&arr.get(arr.size()-2)=='('&&arr.get(arr.size()-1)==')'){
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
            }
        }
        if(arr.size()>0){
            return false;
        } else{
            return true;
        }
    }
}

