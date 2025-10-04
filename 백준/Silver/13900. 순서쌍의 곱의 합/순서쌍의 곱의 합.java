import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            totalSum += arr[i];
        }

        long answer = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            answer += arr[i] * totalSum;
        }

        System.out.println(answer);
    }
}
