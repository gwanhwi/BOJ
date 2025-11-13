import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] wages = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            wages[i] = Long.parseLong(st.nextToken());
        }
        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum += wages[i];
        }
        long max = sum;
        for (int i = m; i < n; i++) {
            sum += wages[i] - wages[i - m];
            if (sum > max) max = sum;
        }
        System.out.println(max);
    }
}
