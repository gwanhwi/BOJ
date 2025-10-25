import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int minRemain = Integer.MAX_VALUE, burger = 0;

        for (int i = 0; i * n <= t; i++) {
            int remain = t - i * n;
            int j = remain / m;
            int left = remain % m;
            if (left < minRemain || (left == minRemain && i + j > burger)) {
                minRemain = left;
                burger = i + j;
            }
        }
        System.out.println(burger + " " + minRemain);
    }
}
