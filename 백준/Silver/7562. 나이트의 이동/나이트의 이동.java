import java.io.*;
import java.util.*;
public class Main {
    static int targetRow;
    static int targetCol;
    static int len;
    static int[][] graph;
    static boolean[][] visited;
    static int[][] move= {{1,1,2,2,-1,-1,-2,-2},{2,-2,1,-1,2,-2,1,-1}};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            len = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nowRow = Integer.parseInt(st.nextToken());
            int nowCol = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            targetRow = Integer.parseInt(st.nextToken());
            targetCol = Integer.parseInt(st.nextToken());
            graph = new int[len][len];
            visited = new boolean[len][len];
            sb.append(bfs(nowRow,nowCol)).append("\n");
        }
        System.out.println(sb);
    }
    public static int bfs (int r, int c){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {r,c,0});
        visited[r][c]=true;
        while(!q.isEmpty()){
            int[] now=q.poll();
            int nowRow = now[0];
            int nowCol = now[1];
            int count = now[2];
            if(nowRow==targetRow && nowCol==targetCol) return count;
            for(int i=0;i<8;i++){
                int nextRow=nowRow+move[0][i];
                int nextCol=nowCol+move[1][i];
                if(nextRow<0 || nextRow>=len || nextCol<0 || nextCol>=len) continue;;
                if(!visited[nextRow][nextCol]){
                    q.offer(new int[] {nextRow,nextCol,count+1});
                    visited[nextRow][nextCol]=true;
                }
            }
        }
        return -1;
    }
}