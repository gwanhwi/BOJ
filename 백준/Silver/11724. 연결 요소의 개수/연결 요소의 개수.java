import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer>[] graph = new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[N+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int count=0;
        for(int i=1;i<=N;i++){
            if(!visited[i]){
                count++;
                visited[i]=true;
                dq.push(i);
                while (!dq.isEmpty()){
                    int u=dq.pop();
                    for(int v : graph[u]){
                        if(!visited[v]) {
                            visited[v]=true;
                            dq.push(v);
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}