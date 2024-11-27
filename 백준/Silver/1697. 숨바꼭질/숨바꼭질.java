import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(findYoungerBFS(N,K));
    }
    public static int findYoungerBFS(int N,int K){
        int kLength=100001;
        boolean[] visited = new boolean[kLength];
        Queue<Integer> q = new LinkedList<>();
        visited[N]=true;
        q.offer(N);
        int time=0;
        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i=0;i<qSize;i++) {
                int now = q.poll();
                if(now == K) return time;
                int[] nextPosition = {now+1,now-1,now*2};
                for(int nextPos : nextPosition){
                    if(nextPos<0 || nextPos >100000 || visited[nextPos]) continue;
                    visited[nextPos]=true;
                    q.offer(nextPos);
                }
            }
            time++;
        }
        return -1;
    }
}