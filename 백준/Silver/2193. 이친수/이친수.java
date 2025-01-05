import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N+1];
        dp[1]=1;
        for(int i=2;i<=N;i++){
            dp[i]=dp[i-1] + dp[i-2]; // 0으로 끝나는 것 개수 + 1로 끝나는 것 개수
        }
        System.out.println(dp[N]);
    }
}