import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            int[][] arr= new int[2][n+1];
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                arr[0][j]=Integer.parseInt(st1.nextToken());
                arr[1][j]=Integer.parseInt(st2.nextToken());
            }

            int[][] dp = new int[2][n+1];
            dp[0][1]=arr[0][1];
            dp[1][1]=arr[1][1];
            for(int j=2;j<=n;j++){
                dp[0][j]=Math.max(dp[1][j-1],Math.max(dp[0][j-2],dp[1][j-2]))+arr[0][j];
                dp[1][j]=Math.max(dp[0][j-1],Math.max(dp[0][j-2],dp[1][j-2]))+arr[1][j];

            }
            sb.append(Math.max(dp[0][n],dp[1][n])).append("\n");
        }
        System.out.println(sb);
    }
}
