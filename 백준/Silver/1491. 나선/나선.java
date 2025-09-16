import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] visited = new boolean[m][n];

        int x = m - 1;
        int y = 0;
        visited[x][y] = true;

        int d = 1;

        int filled = 1;
        int total = n * m;

        int a = 0;
        int b = 0;

        while (filled < total) {
            if (d > 4) d = 1;

            if (d == 1) {
                if (y + 1 >= n || visited[x][y + 1]) {
                    d++;
                } else {
                    y++;
                    visited[x][y] = true;
                    filled++;
                    a++;
                }
            } else if (d == 2) {
                if (x - 1 < 0 || visited[x - 1][y]) {
                    d++;
                } else {
                    x--;
                    visited[x][y] = true;
                    filled++;
                    b++;
                }
            } else if (d == 3) {
                if (y - 1 < 0 || visited[x][y - 1]) {
                    d++;
                } else {
                    y--;
                    visited[x][y] = true;
                    filled++;
                    a--;
                }
            } else {
                if (x + 1 >= m || visited[x + 1][y]) {
                    d++;
                } else {
                    x++;
                    visited[x][y] = true;
                    filled++;
                    b--;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}
