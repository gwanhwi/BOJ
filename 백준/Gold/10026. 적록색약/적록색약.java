import java.io.*;
import java.util.*;

class Main {
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        char[][] picture = new char[N][N];
        char[][] pictureREqualG = new char[N][N];
        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<N;j++){
                picture[i][j] =s.charAt(j);
                if(s.charAt(j)=='G' || s.charAt(j)=='R') pictureREqualG[i][j]='R';
                else pictureREqualG[i][j]=s.charAt(j);
            }
        }
        boolean[][] visited = new boolean[N][N];
        boolean[][] visitedRG = new boolean[N][N];
        int count=0;
        int countRG=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]){
                    bfs(i,j,picture,visited);
                    count++;
                }
                if(!visitedRG[i][j]){
                    bfs(i,j,pictureREqualG,visitedRG);
                    countRG++;
                }
            }
        }
        sb.append(count).append(" ").append(countRG);
        System.out.println(sb);
    }
    public static void bfs(int r, int c, char[][] picture, boolean[][] visited){
        int[][] move = {{1,-1,0,0},{0,0,1,-1}};
        Queue<int[]> q = new LinkedList<>();
        visited[r][c]=true;
        q.offer(new int[] {r,c});
        while(!q.isEmpty()){
            int[] now = q.poll();
            int nowRow=now[0];
            int nowCol=now[1];
            char nowColor = picture[nowRow][nowCol];
            for(int i=0;i<4;i++){
                int nextRow = nowRow + move[0][i];
                int nextCol = nowCol + move[1][i];
                if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=N ||
                        picture[nextRow][nextCol]!=nowColor || visited[nextRow][nextCol]) continue;
                visited[nextRow][nextCol]=true;
                q.offer(new int[] {nextRow,nextCol});
            }
        }
    }
}