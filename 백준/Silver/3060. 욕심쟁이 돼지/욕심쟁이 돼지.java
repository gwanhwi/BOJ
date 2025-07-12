import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] feed = new int[6];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int total = 0;
            for (int i = 0; i < 6; i++) {
                feed[i] = Integer.parseInt(st.nextToken());
                total += feed[i];
            }

            if (total > N) {
                System.out.println(1);
                continue;
            }

            int day = 1;

            while (true) {
                int[] next = new int[6];
                int nextTotal = 0;
                for (int i = 0; i < 6; i++) {
                    int left = feed[(i + 5) % 6];
                    int right = feed[(i + 1) % 6];
                    int opposite = feed[(i + 3) % 6];
                    next[i] = feed[i] + left + right + opposite;
                    nextTotal += next[i];
                }
                if (nextTotal > N) {
                    System.out.println(day + 1);
                    break;
                }
                feed = next;
                day++;
            }
        }
    }
}
