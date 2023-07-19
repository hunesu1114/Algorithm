import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer=0;
        int length=A.length;
        ArrayList<Integer> arrA=new ArrayList<>();
        ArrayList<Integer> arrB=new ArrayList<>();
        for(int i=0;i<length;i++){
            arrA.add(A[i]);
            arrB.add(B[i]);
        }
        
        Collections.sort(arrA);
        Collections.sort(arrB);
        
        for(int i=0;i<length;i++){
            answer+=arrA.get(i)*arrB.get(length-1-i);
        }
        return answer;
    }
}
