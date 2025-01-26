import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] graph = new int[N][N];
        long[][] arr = new long[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                graph[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        arr[0][0]=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int nextRow = i + graph[i][j];
                int nextCol = j + graph[i][j];
                if(graph[i][j]==0) continue;
                if(nextRow<N){
                    arr[nextRow][j]+=arr[i][j];
                }
                if(nextCol<N){
                    arr[i][nextCol]+=arr[i][j];
                }
            }
        }
        System.out.println(arr[N-1][N-1]);
    }
}