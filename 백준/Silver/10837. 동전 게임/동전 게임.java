import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        int middle = K / 2;
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x <= middle && y <= middle) {
                sb.append("1\n");
            } else {
                if (x >= y) {
                    if (y + (K - x) + 2 >= x) sb.append("1\n");
                    else sb.append("0\n");
                } else {
                    if (x + (K - y) + 1 >= y) sb.append("1\n");
                    else sb.append("0\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
