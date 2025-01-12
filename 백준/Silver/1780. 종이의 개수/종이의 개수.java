import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr;
    static int[] answer;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        answer=new int[3];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        cutPaper(N,0,0);
        sb.append(answer[2]).append("\n").append(answer[0]).append("\n").append(answer[1]);
        System.out.println(sb);
    }
    public static void cutPaper(int N, int r, int c){
        int num=arr[r][c];
        boolean isClear=true;
        for(int i=r;i<r+N;i++){
            for(int j=c;j<c+N;j++){
                if(arr[i][j]!=num){
                    isClear=false;
                    break;
                }
            }
        }
        if(isClear){
            if(num==-1) answer[2]++;
            else answer[num]++;
        }
        else{
            int nextN=N/3;
            cutPaper(nextN,r,c);
            cutPaper(nextN,r,c+nextN);
            cutPaper(nextN,r,c+nextN*2);
            cutPaper(nextN,r+nextN,c);
            cutPaper(nextN,r+nextN,c+nextN);
            cutPaper(nextN,r+nextN,c+nextN*2);
            cutPaper(nextN,r+nextN*2,c);
            cutPaper(nextN,r+nextN*2,c+nextN);
            cutPaper(nextN,r+nextN*2,c+nextN*2);
        }
    }
}
