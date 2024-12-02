import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        for(int i=0;i<N;i++){
            scores[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[N];
        dp[0] = scores[0];
        if(N>=2) dp[1] = scores[0]+scores[1];
        if(N>=3) dp[2] = Math.max(scores[0]+scores[2],scores[1]+scores[2]);
        for(int i=3;i<N;i++){
            dp[i]=Math.max(dp[i-2]+scores[i],dp[i-3]+scores[i-1]+scores[i]);
        }
        System.out.println(dp[N-1]);
    }
}