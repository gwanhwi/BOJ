import java.io.*;
import java.util.*;

class Main {
    static int N;
    static char[][] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                arr[i][j]=str.charAt(j);
            }
        }
        int answer=countMaxNum();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j+1<N && arr[i][j]!=arr[i][j+1]){
                    char tmp=arr[i][j];
                    arr[i][j]=arr[i][j+1];
                    arr[i][j+1]=tmp;
                    answer=Math.max(answer,countMaxNum());
                    arr[i][j+1]=arr[i][j];
                    arr[i][j]=tmp;
                }
                if(i+1<N && arr[i][j]!=arr[i+1][j]){
                    char tmp=arr[i][j];
                    arr[i][j]=arr[i+1][j];
                    arr[i+1][j]=tmp;
                    answer=Math.max(answer,countMaxNum());
                    arr[i+1][j]=arr[i][j];
                    arr[i][j]=tmp;
                }
            }
        }
        System.out.println(answer);
    }
    public static int countMaxNum(){
        int maxCount=0;
        for(int i=0;i<N;i++){
            int beforeRowColor = arr[i][0];
            int beforeColColor = arr[0][i];

            int rowCount=1;
            int colCount=1;
            for(int j=1;j<N;j++){
                if(arr[i][j]==beforeRowColor) rowCount++;
                else {
                    maxCount=Math.max(maxCount,rowCount);
                    rowCount=1;
                    beforeRowColor=arr[i][j];
                }
                if(arr[j][i]==beforeColColor) colCount++;
                else {
                    maxCount=Math.max(maxCount,colCount);
                    colCount=1;
                    beforeColColor=arr[j][i];
                }
            }
            maxCount=Math.max(maxCount,Math.max(colCount,rowCount));

        }
        return maxCount;
    }
}