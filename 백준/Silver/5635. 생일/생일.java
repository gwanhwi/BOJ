import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        String youngestName = "";
        String oldestName = "";
        int maxY = Integer.MIN_VALUE, maxM = Integer.MIN_VALUE, maxD = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, minM = Integer.MAX_VALUE, minD = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if ((y > maxY) ||
                (y == maxY && m > maxM) ||
                (y == maxY && m == maxM && d > maxD)) {
                maxY = y; maxM = m; maxD = d;
                youngestName = name;
            }
            if ((y < minY) ||
                (y == minY && m < minM) ||
                (y == minY && m == minM && d < minD)) {
                minY = y; minM = m; minD = d;
                oldestName = name;
            }
        }

        System.out.println(youngestName);
        System.out.println(oldestName);
    }
}
