import java.io.*;
import java.util.*;
class Main {
    static List<int[]>[] graph;
    static int V;
    static int E;
    static int K;
    static int[] distance;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        graph = new ArrayList[V+1];
        for(int i=0;i<V+1;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<E;i++){
            st= new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new int[] {v,w});
        }
        dijkstra();
        for(int i=1;i<distance.length;i++){
            if(distance[i]==Integer.MAX_VALUE) sb.append("INF").append("\n");
            else sb.append(distance[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void dijkstra(){
        distance = new int[V+1];
        boolean[] visited = new boolean[V+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[K]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[1] - o2[1];     
            }
        });
        visited[K]=true;
        pq.offer(new int[] {K,0});
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            for (int[] next : graph[now[0]]){
                if(distance[next[0]] > distance[now[0]]+next[1]) {
                    distance[next[0]]=distance[now[0]]+next[1];
                    pq.offer(new int[] {next[0],distance[next[0]]});
                }
            }
        }
    }
}