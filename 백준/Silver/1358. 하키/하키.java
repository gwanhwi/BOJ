import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int count = 0;
        int R = H / 2;
        int centerY = Y + R;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());

            if (px >= X && px <= X + W && py >= Y && py <= Y + H) {
                count++;
            }
            else if (px < X) {
                int dx = px - X;
                int dy = py - centerY;
                if (dx*dx + dy*dy <= R * R) {
                    count++;
                }
            }
            else if (px > X + W) {
                int dx = px - (X + W);
                int dy = py - centerY;
                if (dx*dx + dy*dy <= R * R) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
