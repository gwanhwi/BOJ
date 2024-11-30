import java.io.*;
import java.util.*;

class Main {
    static int N;
    static List<Integer>[] graph;
    static boolean[] visited;
    static int count=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        graph = new ArrayList[N+1];
        visited= new boolean[N+1];
        for(int i=1;i<N+1;i++) graph[i]=new ArrayList<>();
        for(int i=0;i<e;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        visited[1]=true;
        dfs(1);
        System.out.println(count);
    }
    public static void dfs(int computerNum){
        for(int v : graph[computerNum]){
            if(visited[v]) continue;
            visited[v]=true;
            count++;
            dfs(v);
        }
    }
}