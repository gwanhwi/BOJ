import java.io.*;
import java.util.*;

class Main {
    static boolean[][] visited;
    static int[][] paper;
    static int N;
    static int[][] move = {{1,-1,0,0},{0,0,1,-1}};
    static int countWhite=0;

    static int countBlue=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        visited = new boolean[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                paper[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        bfs(N,0,0);
        sb.append(countWhite).append("\n").append(countBlue);
        System.out.println(sb);
    }
    static void bfs(int n, int r, int c){
        Queue<int[]> q = new LinkedList<>();
        visited[r][c]=true;
        q.offer(new int[] {r,c});
        int countOne=0;
        int countZero=0;
        while(!q.isEmpty()){
            int[] now = q.poll();
            int nowRow = now[0];
            int nowCol = now[1];
            if(paper[nowRow][nowCol]==0) {
                countZero++;
            }
            if(paper[nowRow][nowCol]==1) {
                countOne++;
            }
            for(int i=0;i<4;i++){
                int nextRow = nowRow + move[0][i];
                int nextCol = nowCol + move[1][i];
                if(nextRow<r || nextRow>=n+r || nextCol<c || nextCol>=n+c || visited[nextRow][nextCol]) continue;
                visited[nextRow][nextCol]=true;
                q.offer(new int[] {nextRow,nextCol});
            }
            if(countOne*countZero!=0){
                visited = new boolean[N][N];

                bfs(n/2, r,c);
                bfs(n/2, r,c + n/2);
                bfs(n/2, r + n/2,c);
                bfs(n/2, r + n/2,c + n/2);
                return;
            }
        }
        if(countZero>0) countWhite++;
        if(countOne>0) countBlue++;
    }
}