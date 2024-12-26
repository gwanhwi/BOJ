import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N+1];
        int[] P = new int[N+1];
        int[] dp = new int[N+2];
        for(int i=1;i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] =Integer.parseInt(st.nextToken());
            P[i] =Integer.parseInt(st.nextToken());
        }
        for(int i=N;i>0;i--){
            dp[i]=dp[i+1];
            if(i+T[i]<N+2){
                dp[i]=Math.max(P[i]+dp[i+T[i]],dp[i]);
            }
        }
        System.out.println(dp[1]);
    }
}