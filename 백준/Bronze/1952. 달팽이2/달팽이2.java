import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int M = Integer.parseInt(parts[0]);
        int N = Integer.parseInt(parts[1]);
        boolean[][] visited = new boolean[M][N];
        int[][] dxy = { {0,1}, {1,0}, {0,-1}, {-1,0} };
        int dir = 0;
        int x = 0, y = 0;
        visited[0][0] = true;
        int turnCount = 0;
        int filled = 1;
        int total = M * N;

        while (filled < total) {
            int nx = x + dxy[dir][0];
            int ny = y + dxy[dir][1];
            if (nx < 0 || nx >= M || ny < 0 || ny >= N || visited[nx][ny]) {
                dir = (dir + 1) % 4;
                turnCount++;
                nx = x + dxy[dir][0];
                ny = y + dxy[dir][1];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N || visited[nx][ny]) {
                    break;
                }
            }
            x = nx;
            y = ny;
            visited[x][y] = true;
            filled++;
        }

        System.out.println(turnCount);
    }
}
