import java.io.*;
import java.util.*;

class Main {
    static List<Integer>[] graph;
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            graph[i]= new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        int min=Integer.MAX_VALUE;
        int[] kevinCount = new int[N+1];
        for(int i=1;i<=N;i++){
            kevinCount[i]=dijkstra(i);
            min=Math.min(min,kevinCount[i]);
        }
        for(int i=1;i<=N;i++){
            if(kevinCount[i]==min){
                sb.append(i);
                break;
            }
        }
        System.out.println(sb);
    }
    public static int dijkstra(int start){
        int[] dist = new int[N+1];
        boolean[] visited = new boolean[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] =0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)-> o1[1]-o2[1]);
        pq.offer(new int[] {start,dist[start]});
        while(!pq.isEmpty()){
            int[] now = pq.poll();
            int nowUser = now[0];
            int nowCost = now[1];
            visited[nowUser]=true;
            for(int v : graph[nowUser]){
                if(visited[v]) continue;
                if(nowCost+1<dist[v]) {
                    dist[v] = nowCost+1;
                    pq.offer(new int[] {v,dist[v]});
                }
            }
        }
        int sum=0;
        for(int i=1;i<=N;i++){
            if(dist[i]<Integer.MAX_VALUE){
                sum+=dist[i];
            }
        }
        return sum;
    }
}