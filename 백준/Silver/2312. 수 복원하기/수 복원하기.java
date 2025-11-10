import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int d = 2;
            while (n > 1) {
                int cnt = 0;
                while (n % d == 0) {
                    n /= d;
                    cnt++;
                }
                if (cnt > 0) sb.append(d).append(" ").append(cnt).append("\n");
                d++;
                if (d * d > n) break;
            }
            if (n > 1) sb.append(n).append(" 1\n");
        }
        System.out.print(sb);
    }
}
