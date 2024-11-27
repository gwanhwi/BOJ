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
        int kLength=200000;
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
                if (now + 1 < kLength && !visited[now + 1]) {
                    visited[now+1]=true;
                    q.offer(now + 1);
                }
                if (now - 1 >= 0 && !visited[now - 1]) {
                    visited[now-1]=true;
                    q.offer(now - 1);
                }
                if (now * 2 < kLength && !visited[now * 2]) {
                    visited[now*2]=true;
                    q.offer(now * 2);
                }
            }
            time++;
        }
        return -1;
    }
}