import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] condo = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            condo[i][0] = Integer.parseInt(st.nextToken());
            condo[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(condo, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        int count = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (condo[i][1] < minPrice) {
                count++;
                minPrice = condo[i][1];
            }
        }

        System.out.println(count);
    }
}
