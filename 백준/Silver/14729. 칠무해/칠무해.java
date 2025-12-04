import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            double score = Double.parseDouble(br.readLine().trim());
            if (pq.size() < 7) {
                pq.offer(score);
            } else {
                if (pq.peek() > score) {
                    pq.poll();
                    pq.offer(score);
                }
            }
        }

        List<Double> list = new ArrayList<>(pq);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (double s : list) {
            sb.append(String.format("%.3f\n", s));
        }
        System.out.print(sb.toString());
    }
}
