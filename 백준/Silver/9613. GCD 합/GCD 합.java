import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) arr[j] = Long.parseLong(st.nextToken());
            long sum = 0;
            for (int a = 0; a < n - 1; a++)
                for (int b = a + 1; b < n; b++)
                    sum += gcd(arr[a], arr[b]);
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
