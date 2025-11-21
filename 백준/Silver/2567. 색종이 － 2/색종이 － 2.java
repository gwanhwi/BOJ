import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] board = new boolean[101][101];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int a = x; a < x + 10; a++) {
                for (int b = y; b < y + 10; b++) {
                    board[a][b] = true;
                }
            }
        }
        int perimeter = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (!board[i][j]) continue;
                for (int d = 0; d < 4; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];
                    if (ni < 0 || ni > 100 || nj < 0 || nj > 100 || !board[ni][nj]) {
                        perimeter++;
                    }
                }
            }
        }
        System.out.println(perimeter);
    }
}
