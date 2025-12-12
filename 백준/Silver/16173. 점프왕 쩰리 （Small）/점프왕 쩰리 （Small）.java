import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[][] visited = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        String result = "Hing";

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0], c = cur[1];

            if (board[r][c] == -1) {
                result = "HaruHaru";
                break;
            }

            int jump = board[r][c];
            int nr = r, nc = c + jump;
            if (nc < N && !visited[nr][nc]) {
                visited[nr][nc] = true;
                queue.add(new int[]{nr, nc});
            }
            nr = r + jump;
            nc = c;
            if (nr < N && !visited[nr][nc]) {
                visited[nr][nc] = true;
                queue.add(new int[]{nr, nc});
            }
        }

        System.out.println(result);
    }
}
