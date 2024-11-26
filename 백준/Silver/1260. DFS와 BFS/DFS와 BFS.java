import java.io.*;
import java.util.*;
class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        graph=new ArrayList[N+1];
        for(int i=0;i<N+1;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }
        for(int i=0;i<N+1;i++){
            Collections.sort(graph[i]);
        }
        visited= new boolean[N+1];
        visited[V]=true;
        dfs(N,M,V);

        sb.append("\n");
        visited= new boolean[N+1];
        bfs(N,M,V);
        System.out.print(sb);
    }
    public static void dfs(int n, int m, int v){
        sb.append(v).append(" ");
        for(int val : graph[v]){
            if(!visited[val]) {
                visited[val]=true;
                dfs(n,m,val);
            }
        }
    }
    public static void bfs(int n,int m, int v){
        Queue<Integer> queue= new LinkedList<>();
        visited[v]=true;
        queue.offer(v);
        while(!queue.isEmpty()){
            int now = queue.poll();
            sb.append(now).append(" ");
            for(int val : graph[now]){
                if(!visited[val]) {
                    visited[val]=true;
                    queue.offer(val);
                }
            }
        }
    }
}