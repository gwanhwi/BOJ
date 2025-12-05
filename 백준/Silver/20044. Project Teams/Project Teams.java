import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 2 * n;
        int[] w = new int[total];
        for (int i = 0; i < total; i++) {
            w[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(w);

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int teamPower = w[i] + w[total - 1 - i];
            answer = Math.min(answer, teamPower);
        }

        System.out.println(answer);
    }
}
