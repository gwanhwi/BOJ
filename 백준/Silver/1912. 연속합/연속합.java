import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n+1];

        for(int i=1;i<=n;i++){
            if(dp[i-1]<0){
                dp[i]=arr[i];
                continue;
            }
            dp[i]=dp[i-1]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
