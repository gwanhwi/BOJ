import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        char[] wheel = new char[N];
        for (int i = 0; i < N; i++) {
            wheel[i] = '?';
        }
        
        int pos = 0;
        boolean conflict = false;
        
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            char C = st.nextToken().charAt(0);
            
            pos = (pos + S) % N;
            
            if (wheel[pos] == '?') {
                wheel[pos] = C;
            } else if (wheel[pos] != C) {
                conflict = true;
            }
        }
        
        if (conflict) {
            System.out.println("!");
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (char c : wheel) {
            if (c != '?') {
                if (!set.add(c)) {
                    System.out.println("!");
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(wheel[(pos - i + N) % N]);
        }
        
        System.out.println(sb.toString());
    }
}
