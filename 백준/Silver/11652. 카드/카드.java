import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long answer = 0;
        int maxCount = 0;

        for (long key : map.keySet()) {
            int count = map.get(key);
            if (count > maxCount || (count == maxCount && key < answer)) {
                maxCount = count;
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
