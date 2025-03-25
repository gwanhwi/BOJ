import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                if(str.charAt(j)=='.'){
                    arr[i][j]=0;
                } else{
                    arr[i][j]=1;
                }
            }
        }
        int answer=0;
        //가로
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[i][j]==1){
                    if(count>=2) {
                        answer++;
                    }
                    count=0;
                } else{
                    count++;
                }

                if(j==N-1 && count>=2){
                    answer++;
                }
            }
        }
        sb.append(answer).append(" ");
        answer=0;
        //세로
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[j][i]==1){
                    if(count>=2) {
                        answer++;
                    }
                    count=0;
                } else{
                    count++;
                }

                if(j==N-1 && count>=2){
                    answer++;
                }
            }
        }
        sb.append(answer);
        System.out.println(sb);
    }
}