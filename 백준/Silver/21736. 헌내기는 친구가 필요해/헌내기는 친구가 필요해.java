import java.io.*;
import java.util.*;

class Main {
    static int[][] graph;
    static int N;
    static int M;
    static char[][] campus;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new char[N][M];
        int[] doyeon = new int[2];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                campus[i][j]=str.charAt(j);
                if(campus[i][j]=='I'){
                    doyeon[0]=i;
                    doyeon[1]=j;
                }
            }
        }
        int count = bfs(doyeon[0],doyeon[1]);
        if(count==0) sb.append("TT");
        else sb.append(count);
        System.out.println(sb);
    }
    public static int bfs(int r, int c){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int[][] move = {{1,-1,0,0},{0,0,1,-1}};
        int count=0;
        visited[r][c]=true;
        q.offer(new int[] {r,c});
        while(!q.isEmpty()){
            int[] now = q.poll();
            for(int i=0;i<4;i++){
                int nextRow = now[0] + move[0][i];
                int nextCol = now[1] + move[1][i];
                if(nextRow<0||nextRow>=N||nextCol<0||nextCol>=M||campus[nextRow][nextCol]=='X'
                        ||visited[nextRow][nextCol]) continue;
                if(campus[nextRow][nextCol]=='P') count++;
                visited[nextRow][nextCol]=true;
                q.offer(new int[] {nextRow,nextCol});
            }
        }

        return count;
    }
}