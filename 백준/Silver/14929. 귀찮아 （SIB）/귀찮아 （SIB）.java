import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
        long sum = 0, result = 0;
        for (int i = n - 1; i >= 0; i--) {
            result += arr[i] * sum;
            sum += arr[i];
        }
        System.out.println(result);
    }
}
