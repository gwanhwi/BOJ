import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int target = Integer.parseInt(br.readLine().trim());
        int[][] a = new int[N][N];
        int r = N / 2;
        int c = N / 2;
        int num = 1;
        a[r][c] = num;
        int tr = (num == target) ? r + 1 : 0;
        int tc = (num == target) ? c + 1 : 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int dir = 0;
        int stepLen = 1;
        while (num < N * N) {
            for (int k = 0; k < 2; k++) {
                for (int s = 0; s < stepLen; s++) {
                    if (num >= N * N) break;
                    r += dr[dir];
                    c += dc[dir];
                    num++;
                    a[r][c] = num;
                    if (num == target) {
                        tr = r + 1;
                        tc = c + 1;
                    }
                }
                dir = (dir + 1) % 4;
            }
            stepLen++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(a[i][j]);
                if (j < N - 1) sb.append(" ");
            }
            sb.append("\n");
        }
        sb.append(tr).append(" ").append(tc);
        System.out.print(sb.toString());
    }
}
