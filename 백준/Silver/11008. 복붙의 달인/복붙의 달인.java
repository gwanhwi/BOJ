import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String p = st.nextToken();
            int count = 0;
            int idx = 0;
            while (idx < s.length()) {
                if (idx + p.length() <= s.length() && s.substring(idx, idx + p.length()).equals(p)) {
                    count++;
                    idx += p.length();
                } else {
                    count++;
                    idx++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }
}
