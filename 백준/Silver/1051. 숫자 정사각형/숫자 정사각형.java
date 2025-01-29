import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int[] numCount = new int[10];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j]=str.charAt(j)-'0';
                numCount[arr[i][j]]++;
            }
        }
        int maxSize=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(numCount[arr[i][j]]<4) continue;
                int minLen = Math.min(N,M);
                for(int k=minLen-1;k>=0;k--){
                    if(i+k >=N || j+k >=M) continue;
                    if(arr[i][j]==arr[i+k][j] && arr[i][j]==arr[i][j+k] && arr[i][j]==arr[i+k][j+k]) {
                        maxSize=Math.max(maxSize,k+1);
                    }
                }
            }
        }
        System.out.println(maxSize*maxSize);
    }
}