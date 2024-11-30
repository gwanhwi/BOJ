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
        dividePaper(N,0,0);
        sb.append(countWhite).append("\n").append(countBlue);
        System.out.println(sb);
    }
    static void dividePaper(int n, int r, int c){
        int startColor = paper[r][c];
        for(int i=r;i<n+r;i++){
            for(int j=c;j<n+c;j++){
                if(paper[i][j]!=startColor){
                    dividePaper(n/2, r,c);
                    dividePaper(n/2, r,c + n/2);
                    dividePaper(n/2, r + n/2,c);
                    dividePaper(n/2, r + n/2,c + n/2);
                    return;
                }
            }
        }
        if(startColor==0) countWhite++;
        if(startColor==1) countBlue++;
    }
}