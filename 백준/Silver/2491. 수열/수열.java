import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 1;
        int inc = 1;
        int dec = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] >= arr[i - 1]) {
                inc++;
            } else {
                inc = 1;
            }

            if (arr[i] <= arr[i - 1]) {
                dec++;
            } else {
                dec = 1;
            }

            max = Math.max(max, Math.max(inc, dec));
        }

        System.out.println(max);
    }
}
