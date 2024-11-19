import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] move ={{-1,0,+1,0},{0,+1,0,-1}}; //북동남서
    static int N;
    static int M;
    static int count=0;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());//0:북, 1:동, 2:남, 3:서
        arr = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        dfs(r,c,d);
        System.out.println(count);
    }
    public static void dfs(int r, int c, int d){
        if(arr[r][c]==0) {
            arr[r][c]=3;
            count++;
        }
        for(int i=0;i<4;i++){
            d=(d+3)%4; //반시계 90도 회전
            int nextRow=r+move[0][d];
            int nextCol=c+move[1][d];
            if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=M || arr[nextRow][nextCol]!=0) continue;
            dfs(nextRow,nextCol,d); //빈 칸이 있는경우
            return;
        }
        //빈 칸이 없는 경우
        int backD=(d+2)%4;
        int nextRow=r+move[0][backD];
        int nextCol=c+move[1][backD];
        if(nextRow<0 || nextRow>=N || nextCol<0 || nextCol>=M || arr[nextRow][nextCol]==1) return;
        dfs(nextRow,nextCol,d);
    }
}
