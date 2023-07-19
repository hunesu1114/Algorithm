class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr2_row_num=arr2.length;
        int arr2_col_num=arr2[0].length;
        int[][] answer=new int[arr1.length][arr2_col_num];

        //arr2의 전치행렬 = transposedArr2
        int[][] transposedArr2=new int[arr2_col_num][arr2_row_num];
        for(int i=0;i<arr2_col_num;i++){
            for(int j=0;j<arr2_row_num;j++){
                transposedArr2[i][j]=arr2[j][i];
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            answer[i]=getRow(arr1[i],transposedArr2);
        }
        return answer;
    }
    
    //return : 행 하나 리턴
    public static int[] getRow(int[] arr1_row, int[][] transposedArr2){
        int len1=arr1_row.length;
        int len2=transposedArr2.length;
        int[] returnRow=new int[len2];
        for(int i=0;i<len2;i++){
            for(int j=0;j<len1;j++){
                returnRow[i]+=arr1_row[j]*transposedArr2[i][j];
            }
        }
        return returnRow;
    }
}
