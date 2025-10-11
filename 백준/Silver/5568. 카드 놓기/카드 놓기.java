import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static String[] cards;
    static boolean[] visited;
    static HashSet<String> set = new HashSet<>();

    static void dfs(String str, int depth) {
        if (depth == k) {
            set.add(str);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(str + cards[i], depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine().trim());
        k = Integer.parseInt(br.readLine().trim());
        cards = new String[n];
        for (int i = 0; i < n; i++) cards[i] = br.readLine().trim();
        visited = new boolean[n];
        dfs("", 0);
        System.out.println(set.size());
    }
}
