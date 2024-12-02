import java.io.*;
import java.util.*;

class Main {
    static int n;
    static int m;
    static int[][] graph;
    static boolean[][] visited;
    static int[][] move = {{1,-1,0,0},{0,0,1,-1}};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
        int[] start=new int[2];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                graph[i][j]=Integer.parseInt(st.nextToken());
                if(graph[i][j]==2) {
                    start[0]=i;
                    start[1]=j;
                }
                if(graph[i][j]==1) {
                    graph[i][j]=-1;
                }
            }
        }
        bfs(start[0],start[1]);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sb.append(graph[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(int r, int c){
        Queue<int[]> q = new LinkedList<>();
        visited[r][c]=true;
        q.offer(new int[] {r,c});
        graph[r][c]=0;
        while(!q.isEmpty()){
            int[] now = q.poll();
            for(int i=0;i<4;i++){
                int nextRow = now[0] + move[0][i];
                int nextCol = now[1] + move[1][i];
                if(nextRow<0||nextRow>=n||nextCol<0||nextCol>=m||visited[nextRow][nextCol] || graph[nextRow][nextCol]==0) continue;
                graph[nextRow][nextCol]= graph[now[0]][now[1]]+1;
                visited[nextRow][nextCol]=true;
                q.offer(new int[] {nextRow,nextCol});
            }
        }
    }
}