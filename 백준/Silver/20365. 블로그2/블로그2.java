import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine().trim();

        int rCnt = 0, bCnt = 0;
        char prev = '\0';
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (c != prev) {
                if (c == 'R') rCnt++;
                else if (c == 'B') bCnt++;
                prev = c;
            }
        }

        int result = Math.min(rCnt, bCnt) + 1;
        System.out.println(result);
    }
}
