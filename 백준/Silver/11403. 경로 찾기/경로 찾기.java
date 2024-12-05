import java.io.*;
import java.util.*;

class Main {
    static int N;
    static int[][] graph;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                graph[i][j]=Integer.parseInt(st.nextToken());
                if(graph[i][j]==0) graph[i][j]=Integer.MAX_VALUE;
            }
        }

        //floydWarshall
        for(int k=0;k<N;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(graph[i][k]!=Integer.MAX_VALUE && graph[k][j]!=Integer.MAX_VALUE){
                        graph[i][j]=Math.min(graph[i][j],graph[i][k]+graph[k][j]);
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(graph[i][j]==Integer.MAX_VALUE) graph[i][j]=0;
                if(graph[i][j]>0) graph[i][j]=1;
                sb.append(graph[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}