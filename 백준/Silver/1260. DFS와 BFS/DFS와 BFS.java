import java.io.*;
import java.util.*;
class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static List<Integer> list;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        graph = new boolean[N+1][N+1];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s][e]=true;
            graph[e][s]=true;
        }
        list = new ArrayList<>();
        visited= new boolean[N+1];
        visited[V]=true;
        dfs(N,M,V);
        for(int i : list) sb.append(i).append(" ");
        sb.append("\n");
        visited= new boolean[N+1];
        list = new ArrayList<>();
        bfs(N,M,V);
        for(int i : list) sb.append(i).append(" ");
        System.out.print(sb);
    }
    public static void dfs(int n, int m, int v){
        list.add(v);
        for(int i=1;i<graph.length;i++){
            if(graph[v][i] && !visited[i]) {
                visited[i]=true;
                dfs(n,m,i);
            }
        }
    }
    public static void bfs(int n,int m, int v){
        Queue<Integer> queue= new LinkedList<>();
        visited[v]=true;
        queue.offer(v);
        while(!queue.isEmpty()){
            int now = queue.poll();
            list.add(now);
            for(int i=1;i<graph.length;i++){
                if(graph[now][i] && !visited[i]) {
                    visited[i]=true;
                    queue.offer(i);
                }
            }
        }
    }
}