import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n+1];
        dp[1]=arr[1];
        if(n>=2) dp[2]=arr[2]+dp[1];
        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]); // 이번 잔을 마셨을때
            dp[i]=Math.max(dp[i], dp[i-1]); // 이번 잔을 안 마셨을 때
        }
        System.out.println(dp[n]);
    }
}
