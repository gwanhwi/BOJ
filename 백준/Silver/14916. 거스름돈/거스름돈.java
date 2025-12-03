import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        final int INF = Integer.MAX_VALUE / 2;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        if (n >= 2) dp[2] = 1;
        if (n >= 5) dp[5] = 1;

        for (int i = 1; i <= n; i++) {
            if (i - 2 >= 0) {
                dp[i] = Math.min(dp[i], dp[i - 2] + 1);
            }
            if (i - 5 >= 0) {
                dp[i] = Math.min(dp[i], dp[i - 5] + 1);
            }
        }

        if (dp[n] >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n]);
        }
    }
}
