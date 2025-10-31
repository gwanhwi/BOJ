import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int[][] sticker = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sticker[i][0] = Integer.parseInt(st.nextToken());
            sticker[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int r1 = sticker[i][0], c1 = sticker[i][1];
                int r2 = sticker[j][0], c2 = sticker[j][1];

                int area1 = r1 * c1 + r2 * c2;

                if (canAttach(H, W, r1, c1, r2, c2) || canAttach(H, W, r1, c1, c2, r2) ||
                    canAttach(H, W, c1, r1, r2, c2) || canAttach(H, W, c1, r1, c2, r2)) {
                    max = Math.max(max, area1);
                }
            }
        }
        System.out.println(max);
    }

    static boolean canAttach(int H, int W, int r1, int c1, int r2, int c2) {
        return (r1 + r2 <= H && Math.max(c1, c2) <= W) || (c1 + c2 <= W && Math.max(r1, r2) <= H);
    }
}
