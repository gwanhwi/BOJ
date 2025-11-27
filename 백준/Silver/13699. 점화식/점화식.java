import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[36];
        dp[0] = 1L;

        for (int i = 1; i <= n; i++) {
            long sum = 0L;
            for (int j = 0; j < i; j++) {
                sum += dp[j] * dp[i - 1 - j];
            }
            dp[i] = sum;
        }

        System.out.println(dp[n]);
    }
}
