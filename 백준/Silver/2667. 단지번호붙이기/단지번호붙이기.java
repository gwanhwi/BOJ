import java.io.*;
import java.util.*;
public class Main {
    static int[][] graph;
    static boolean[][] visited;
    static int N;
    static int[][] move = {{1,-1,0,0},{0,0,1,-1}};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        graph= new int[N][N];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                graph[i][j]=str.charAt(j)-'0';
            }
        }
        visited = new boolean[N][N];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(graph[i][j]==1 && !visited[i][j]){
                    list.add(bfs(i,j));
                }
            }
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
    public static int bfs(int r, int c){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {r,c});
        visited[r][c]=true;
        int count=1;
        while (!q.isEmpty()){
            int[] now = q.poll();
            int nowRow=now[0];
            int nowCol=now[1];
            for(int i=0;i<4;i++){
                int nextRow = nowRow + move[0][i];
                int nextCol = nowCol + move[1][i];
                if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=N) continue;
                if(graph[nextRow][nextCol]==1 && !visited[nextRow][nextCol]){
                    q.offer(new int[] {nextRow, nextCol});
                    visited[nextRow][nextCol]=true;
                    count++;
                }
            }
        }
        return count;
    }
}
