import java.io.*;
import java.util.*;

class Main {
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        List<int[]>[] graph = new ArrayList[N+1];
        List<int[]>[] reverseGraph = new ArrayList[N+1];
        for(int i=1;i<N+1;i++){
            graph[i]=new ArrayList<>();
            reverseGraph[i]=new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[u].add(new int[] {v,cost});
            reverseGraph[v].add(new int[] {u,cost});
        }
        int[] timeToX = dijkstra(reverseGraph,X);
        int[] timeFromX = dijkstra(graph,X);
        int maxTime=0;
        for(int i=1;i<N+1;i++){
            maxTime=Math.max(maxTime, timeToX[i]+timeFromX[i]);
        }


        System.out.println(maxTime);
    }
    static int[] dijkstra(List<int[]>[] graph, int start){
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->o1[1]-o2[1]);
        boolean[] visited = new boolean[N+1];
        int[] dist = new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0;
        pq.offer(new int[] {start, dist[start]});
        while(!pq.isEmpty()){
            int[] now = pq.poll();
            visited[now[0]]=true;
            for(int[] next : graph[now[0]]){
                if(visited[next[0]]) continue;
                if(dist[next[0]] > dist[now[0]]+ next[1]){
                    dist[next[0]]=dist[now[0]]+ next[1];
                    pq.offer(new int[] {next[0],dist[next[0]]});
                }
            }
        }
        return dist;
    }
}