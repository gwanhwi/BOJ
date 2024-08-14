import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
        while (!que.isEmpty()) {
            sb.append(que.poll());
            if (que.size() > 0) {
                sb.append(" ");
                que.offer(que.poll());
            }
        }
        System.out.println(sb);
    }
}