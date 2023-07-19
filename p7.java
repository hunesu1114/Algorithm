class Solution {
    public String solution(String s) {
        StringBuilder answer=new StringBuilder();
        int length=s.length();
        int uni0=(int)'0';
        int uni9=(int)'9';
        for(int i=0; i<length;i++){
            if(s.charAt(i)==' '){
                answer.append(' ');
            } else if((int)s.charAt(i)<=uni9&&(int)s.charAt(i)>=uni0){
                answer.append(s.charAt(i));
            } else if((i!=0&&s.charAt(i-1)==' ')||i==0){
                answer.append(Character.toUpperCase(s.charAt(i)));  
            } else {
                answer.append(Character.toLowerCase(s.charAt(i)));
            } 
        }
        return answer.toString();
    }
}
