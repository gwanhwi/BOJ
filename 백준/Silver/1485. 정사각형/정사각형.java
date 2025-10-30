import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[][] p = new int[4][2];
            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                p[i][0] = Integer.parseInt(st.nextToken());
                p[i][1] = Integer.parseInt(st.nextToken());
            }
            ArrayList<Integer> d = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    int dist = (p[i][0] - p[j][0]) * (p[i][0] - p[j][0]) + (p[i][1] - p[j][1]) * (p[i][1] - p[j][1]);
                    d.add(dist);
                }
            }
            Collections.sort(d);
            if (d.get(0).equals(d.get(1)) && d.get(1).equals(d.get(2)) && d.get(2).equals(d.get(3)) && d.get(4).equals(d.get(5)) && d.get(4) > d.get(0))
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }
        System.out.print(sb);
    }
}
