import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        int M = Integer.parseInt(br.readLine().trim());
        
        int[] lamp = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            lamp[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(lamp);

        int maxGap = 0;
        maxGap = Math.max(maxGap, lamp[0] - 0);
        maxGap = Math.max(maxGap, N - lamp[M - 1]);

        for (int i = 1; i < M; i++) {
            int gap = (lamp[i] - lamp[i - 1] + 1) / 2;
            maxGap = Math.max(maxGap, gap);
        }

        System.out.println(maxGap);
    }
}
