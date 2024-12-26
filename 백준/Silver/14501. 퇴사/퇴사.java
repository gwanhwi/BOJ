import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N+1];
        int[] P = new int[N+1];
        int[] dp = new int[N+1];
        for(int i=1;i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] =Integer.parseInt(st.nextToken());
            P[i] =Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=N;i++){
            dp[i]=Math.max(dp[i],dp[i-1]);
            if(i+T[i]-1<N+1){
                dp[i+T[i]-1] = Math.max(dp[i+T[i]-1],dp[i-1]+P[i]);
            }
        }
        System.out.println(dp[N]);
    }
}