import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[1000001];

        int maxPos = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            arr[x] = g;
            if (x > maxPos) maxPos = x;
        }

        int window = 2 * K + 1;
        long sum = 0, max = 0;

        for (int i = 0; i <= Math.min(window - 1, maxPos); i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i = window; i <= maxPos; i++) {
            sum += arr[i] - arr[i - window];
            if (sum > max) max = sum;
        }

        System.out.println(max);
    }
}
