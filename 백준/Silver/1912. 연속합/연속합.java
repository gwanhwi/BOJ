import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dp = new int[n+1];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int num = Integer.parseInt(st.nextToken());
            dp[i]=Math.max(num,dp[i-1]+num);
            max=Math.max(max,dp[i]);

        }
        System.out.println(max);
    }
}
