import java.io.*;
import java.util.*;

class Main {
    static int[][] graph;
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph=new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                graph[i][j]=Integer.MAX_VALUE;
                if(i==j) graph[i][j]=0;
            }
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v]=1;
            graph[v][u]=1;
        }
        floydWarshall();
        int min=Integer.MAX_VALUE;
        int[] kevinCount=new int[N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                kevinCount[i]+=graph[i][j];
            }
            min=Math.min(min,kevinCount[i]);
        }
        for(int i=1;i<=N;i++){
            if(kevinCount[i]==min) {
                sb.append(i);
                break;
            }
        }
        System.out.println(sb);
    }
    public static void floydWarshall(){
        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(graph[i][k] < Integer.MAX_VALUE && graph[k][j] < Integer.MAX_VALUE){
                        graph[i][j]= Math.min(graph[i][j], graph[i][k]+graph[k][j]);
                    }
                }
            }
        }
    }
}