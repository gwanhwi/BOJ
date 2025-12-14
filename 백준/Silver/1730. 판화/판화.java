import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String moves = br.readLine().trim();
        int[][] mark = new int[N][N];
        
        int x = 0, y = 0;
        for (char cmd : moves.toCharArray()) {
            int nx = x, ny = y;
            if (cmd == 'U') nx--;
            else if (cmd == 'D') nx++;
            else if (cmd == 'L') ny--;
            else if (cmd == 'R') ny++;
            
            if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
            
            if (cmd == 'U' || cmd == 'D') {
                mark[x][y] |= 1;
                mark[nx][ny] |= 1;
            } else {
                mark[x][y] |= 2;
                mark[nx][ny] |= 2;
            }
            x = nx;
            y = ny;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                char out;
                if (mark[i][j] == 0) out = '.';
                else if (mark[i][j] == 1) out = '|';
                else if (mark[i][j] == 2) out = '-';
                else out = '+';
                sb.append(out);
            }
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }
}
