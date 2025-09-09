import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int[] cake = new int[L + 1];
        int[] counts = new int[N + 1];
        int expectMax = 0, expectIdx = 0;
        int realMax = 0, realIdx = 0;
        
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            
            int expect = K - P + 1;
            if (expect > expectMax) {
                expectMax = expect;
                expectIdx = i;
            }
            
            for (int j = P; j <= K; j++) {
                if (cake[j] == 0) {
                    cake[j] = i;
                    counts[i]++;
                }
            }
        }
        
        for (int i = 1; i <= N; i++) {
            if (counts[i] > realMax) {
                realMax = counts[i];
                realIdx = i;
            }
        }
        
        System.out.println(expectIdx);
        System.out.println(realIdx);
    }
}
