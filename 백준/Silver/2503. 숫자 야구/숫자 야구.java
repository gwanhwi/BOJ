import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[][] guess = new int[N][3];
        int[] strike = new int[N];
        int[] ball = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            guess[i][0] = Integer.parseInt(st.nextToken());
            strike[i] = Integer.parseInt(st.nextToken());
            ball[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int num = 123; num <= 987; num++) {
            String s = String.valueOf(num);
            if (s.contains("0")) continue;
            if (s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2))
                continue;

            boolean possible = true;
            for (int i = 0; i < N; i++) {
                String g = String.valueOf(guess[i][0]);
                int sCount = 0, bCount = 0;
                for (int x = 0; x < 3; x++) {
                    if (s.charAt(x) == g.charAt(x)) sCount++;
                    else if (g.contains(String.valueOf(s.charAt(x)))) bCount++;
                }
                if (sCount != strike[i] || bCount != ball[i]) {
                    possible = false;
                    break;
                }
            }
            if (possible) count++;
        }

        System.out.println(count);
    }
}
