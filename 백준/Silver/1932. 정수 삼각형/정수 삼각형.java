import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+2][n+2];
        for(int i=1;i<=n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1;j<=i;j++){

                dp[i][j]=Math.max(dp[i-1][j-1],dp[i-1][j])+Integer.parseInt(st.nextToken());
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
            max=Math.max(max, dp[n][i]);
        }
        System.out.println(max);
    }
}
