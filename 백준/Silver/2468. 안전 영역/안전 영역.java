import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int maxSafeArea=0;
        for(int depth=0;depth<=100;depth++){
            int count=0;
            visited = new boolean[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(arr[i][j]<=depth) visited[i][j]=true;
                }
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(!visited[i][j]){
                        bfs(i,j,depth);
                        count++;
                    }
                }
            }
            if(count > maxSafeArea) maxSafeArea=count;
        }
        System.out.println(maxSafeArea);
    }
    public static void bfs(int row, int col, int depth){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {row, col});
        visited[row][col]=true;

        int[] moveRow = {0,0,-1,1};
        int[] moveCol = {-1,1,0,0};
        while(!queue.isEmpty()){
            int[] n=queue.poll();
            int curRow = n[0];
            int curCol = n[1];
            for(int i=0;i<4;i++){
                int nextRow = curRow + moveRow[i];
                int nextCol = curCol + moveCol[i];
                if(nextRow>=0&& nextRow<N &&nextCol>=0 && nextCol<N && !visited[nextRow][nextCol]){
                    queue.offer(new int[] {nextRow, nextCol});
                    visited[nextRow][nextCol]=true;
                }
            }
        }
    }

}