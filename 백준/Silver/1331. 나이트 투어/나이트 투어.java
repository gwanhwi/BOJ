import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] visited = new boolean[6][6];
        String first = br.readLine();
        String prev = first;
        visited[first.charAt(0) - 'A'][first.charAt(1) - '1'] = true;

        boolean valid = true;
        for (int i = 1; i < 36; i++) {
            String cur = br.readLine();
            int px = prev.charAt(0) - 'A';
            int py = prev.charAt(1) - '1';
            int cx = cur.charAt(0) - 'A';
            int cy = cur.charAt(1) - '1';
            boolean ok = false;
            for (int d = 0; d < 8; d++) {
                if (px + dx[d] == cx && py + dy[d] == cy) {
                    ok = true;
                    break;
                }
            }
            if (!ok || visited[cx][cy]) {
                valid = false;
                break;
            }
            visited[cx][cy] = true;
            prev = cur;
        }

        int fx = first.charAt(0) - 'A';
        int fy = first.charAt(1) - '1';
        int lx = prev.charAt(0) - 'A';
        int ly = prev.charAt(1) - '1';
        boolean close = false;
        for (int d = 0; d < 8; d++) {
            if (lx + dx[d] == fx && ly + dy[d] == fy) close = true;
        }

        System.out.println(valid && close ? "Valid" : "Invalid");
    }
}
