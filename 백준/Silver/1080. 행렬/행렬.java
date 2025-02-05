import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                A[i][j]=str.charAt(j)-'0';
            }
        }
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                B[i][j]=str.charAt(j)-'0';
            }
        }
        int count=0;
        for(int i=0;i<N-2;i++){
            for(int j=0;j<M-2;j++){
                if(A[i][j]!=B[i][j]){
                    count++;
                    changeProcession(A,i,j);
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]!=B[i][j]) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(count);
    }
    public static void changeProcession(int[][] A, int r, int c){
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(A[i][j]==1) A[i][j]=0;
                else A[i][j]=1;
            }
        }
    }
}