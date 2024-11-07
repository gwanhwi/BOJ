import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] graph = new int[N][M];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                graph[i][j]=Character.getNumericValue(str.charAt(j));
            }
        }
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0,0});
        visited[0][0]=true;
        int[] moveRow= {0,0,-1,1};
        int[] moveCol= {1,-1,0,0};
        int[][] count = new int[N][M];
        count[0][0]=1;
        while(!queue.isEmpty()){
            int[] cur=queue.poll();
            int curRow=cur[0];
            int curCol=cur[1];
            for(int i=0;i<4;i++){
                int nextRow = curRow+moveRow[i];
                int nextCol = curCol+moveCol[i];
                if(nextRow<0 ||nextRow>=N || nextCol<0 || nextCol>=M || graph[nextRow][nextCol]==0|| visited[nextRow][nextCol]) continue;
                if(nextRow ==N && nextCol==M){
                    queue.clear();
                    break;
                }
                count[nextRow][nextCol]=count[curRow][curCol]+1;
                queue.offer(new int[] {nextRow, nextCol});
                visited[nextRow][nextCol]=true;
            }

        }
        System.out.println(count[N-1][M-1]);
    }

}