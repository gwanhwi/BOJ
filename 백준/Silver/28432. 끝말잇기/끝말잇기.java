import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] record = new String[N];
        Set<String> used = new HashSet<>();
        int idx = -1;

        for (int i = 0; i < N; i++) {
            record[i] = br.readLine().trim();
            if (record[i].equals("?")) {
                idx = i;
            } else {
                used.add(record[i]);
            }
        }

        int M = Integer.parseInt(br.readLine());
        List<String> candidates = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            candidates.add(br.readLine().trim());
        }

        char firstChar = 0, lastChar = 0;
        boolean needFirst = false, needLast = false;
        if (idx > 0) {
            firstChar = record[idx - 1].charAt(record[idx - 1].length() - 1);
            needFirst = true;
        }
        if (idx < N - 1) {
            lastChar = record[idx + 1].charAt(0);
            needLast = true;
        }

        for (String w : candidates) {
            if (used.contains(w)) continue;
            if (needFirst && w.charAt(0) != firstChar) continue;
            if (needLast && w.charAt(w.length() - 1) != lastChar) continue;
            System.out.println(w);
            break;
        }
    }
}
