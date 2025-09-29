import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[][] pascal = new int[31][31];
        pascal[1][1] = 1;

        for (int i = 2; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }

        int sum = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j <= i; j++) {
                sum += pascal[r+i][c+j];
            }
        }

        System.out.println(sum);
    }
}
