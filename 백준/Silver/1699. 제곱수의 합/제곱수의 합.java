import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        dp[1]=1;
        for(int i=1;i*i<=N;i++) dp[i*i]=1;
        for(int i=2;i<=N;i++){
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[j*j]+dp[i-j*j]);
            }
        }
        System.out.println(dp[N]);
    }
}