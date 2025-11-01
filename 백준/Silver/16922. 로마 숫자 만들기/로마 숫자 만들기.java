import java.io.*;
import java.util.*;

public class Main {
    static int[] coins = {1, 5, 10, 50};
    static boolean[] visited = new boolean[1001];
    static int N, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dfs(0, 0, 0);
        System.out.println(count);
    }

    static void dfs(int depth, int sum, int start) {
        if (depth == N) {
            if (!visited[sum]) {
                visited[sum] = true;
                count++;
            }
            return;
        }
        for (int i = start; i < 4; i++) {
            dfs(depth + 1, sum + coins[i], i);
        }
    }
}
