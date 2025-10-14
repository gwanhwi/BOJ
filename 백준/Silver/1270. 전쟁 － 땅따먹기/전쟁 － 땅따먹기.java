import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            HashMap<Long, Integer> map = new HashMap<>();
            long maxNum = 0;
            int maxFreq = 0;
            for (int j = 0; j < t; j++) {
                long num = Long.parseLong(st.nextToken());
                int cnt = map.getOrDefault(num, 0) + 1;
                map.put(num, cnt);
                if (cnt > maxFreq) {
                    maxFreq = cnt;
                    maxNum = num;
                }
            }

            if (maxFreq > t / 2) {
                System.out.println(maxNum);
            } else {
                System.out.println("SYJKGW");
            }
        }
    }
}
