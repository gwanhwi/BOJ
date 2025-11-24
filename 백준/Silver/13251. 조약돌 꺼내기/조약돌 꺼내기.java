import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] c = new int[M];
        int total = 0;
        for (int i = 0; i < M; i++) {
            c[i] = Integer.parseInt(st.nextToken());
            total += c[i];
        }
        int K = Integer.parseInt(br.readLine());

        double result = 0.0;
        for (int i = 0; i < M; i++) {
            if (c[i] < K) continue;
            double prob = 1.0;
            for (int j = 0; j < K; j++) {
                prob *= (double)(c[i] - j) / (double)(total - j);
            }
            result += prob;
        }

        System.out.printf("%.9f\n", result);
    }
}
