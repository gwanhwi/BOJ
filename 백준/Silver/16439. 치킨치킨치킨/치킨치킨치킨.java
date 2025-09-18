import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] satisfaction = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                satisfaction[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxSum = 0;

        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                for (int k = j + 1; k < M; k++) {
                    int total = 0;
                    for (int p = 0; p < N; p++) {
                        int best = Math.max(satisfaction[p][i], 
                                    Math.max(satisfaction[p][j], satisfaction[p][k]));
                        total += best;
                    }

                    maxSum = Math.max(maxSum, total);
                }
            }
        }

        System.out.println(maxSum);
    }
}
