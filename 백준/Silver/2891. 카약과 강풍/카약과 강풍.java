import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        boolean[] broken = new boolean[n + 1];
        boolean[] reserve = new boolean[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < s; i++) {
            broken[Integer.parseInt(st.nextToken())] = true;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {
            reserve[Integer.parseInt(st.nextToken())] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (broken[i] && reserve[i]) {
                broken[i] = false;
                reserve[i] = false;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (broken[i]) {
                if (i > 1 && reserve[i - 1]) {
                    broken[i] = false;
                    reserve[i - 1] = false;
                } else if (i < n && reserve[i + 1]) {
                    broken[i] = false;
                    reserve[i + 1] = false;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (broken[i]) count++;
        }

        System.out.println(count);
    }
}
