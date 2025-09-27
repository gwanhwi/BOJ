import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        int[] straws = new int[N];
        
        for (int i = 0; i < N; i++) {
            straws[i] = Integer.parseInt(br.readLine().trim());
        }
        
        Arrays.sort(straws);
        
        int result = -1;
        for (int i = N - 1; i >= 2; i--) {
            int a = straws[i];
            int b = straws[i - 1];
            int c = straws[i - 2];
            if (a < b + c) {
                result = a + b + c;
                break;
            }
        }
        
        System.out.println(result);
    }
}
