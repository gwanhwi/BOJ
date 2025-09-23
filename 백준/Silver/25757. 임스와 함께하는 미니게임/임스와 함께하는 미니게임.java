import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine().trim());
        }

        int uniqueCount = set.size();
        int need = 0;

        if (game.equals("Y")) {
            need = 1;
        } else if (game.equals("F")) {
            need = 2;
        } else if (game.equals("O")) {
            need = 3;
        }

        System.out.println(uniqueCount / need);
    }
}
