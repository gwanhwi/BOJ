import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int[][] image = new int[R][C];
        
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                image[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int T = Integer.parseInt(br.readLine().trim());
        
        int count = 0;
        for (int i = 0; i <= R - 3; i++) {
            for (int j = 0; j <= C - 3; j++) {
                int[] window = new int[9];
                int idx = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        window[idx++] = image[x][y];
                    }
                }
                Arrays.sort(window);
                int median = window[4];
                if (median >= T) count++;
            }
        }
        
        System.out.println(count);
    }
}
