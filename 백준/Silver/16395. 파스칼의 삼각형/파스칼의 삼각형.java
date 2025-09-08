import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        int[][] dp = new int[N + 1][N + 1];
        
        for (int i = 1; i <= N; i++) {
            dp[i][1] = 1;
            dp[i][i] = 1;
            for (int j = 2; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        
        System.out.println(dp[N][K]);
    }
}
