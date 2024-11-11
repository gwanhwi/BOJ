import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int N;
    static int M;
    static int[][] move = {{0,0,-1,1},{1,-1,0,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                visited[i][j]=true;
                answer=Math.max(answer,dfs(i,j,arr[i][j],1));
                visited[i][j]=false;
                if(i+1<N && i+2<N && j+1<M){
                    answer=Math.max(answer, arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]);
                }
                if(i+1<N && i+2<N && j-1>=0){
                    answer=Math.max(answer, arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j-1]);
                }
                if(j+1<M && j+2<M && i-1>=0){
                    answer=Math.max(answer, arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i-1][j+1]);
                }
                if(j+1<M && j+2<M && i+1<N){
                    answer=Math.max(answer, arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]);
                }
            }
        }
        System.out.println(answer);
    }
    public static int dfs(int row, int col, int sum, int depth){
        int maxValue=sum;
        if(depth==4){
           return sum;
        }
        for(int i=0;i<4;i++){
            int nextRow=row+move[0][i];
            int nextCol=col+move[1][i];
            if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=M || visited[nextRow][nextCol]) continue;
            visited[nextRow][nextCol]=true;
            maxValue=Math.max(dfs(nextRow,nextCol,sum+arr[nextRow][nextCol],depth+1),maxValue);
            visited[nextRow][nextCol]=false;
        }
        return maxValue;
    }
}