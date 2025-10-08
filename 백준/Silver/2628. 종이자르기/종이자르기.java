import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> horizontal = new ArrayList<>();
        ArrayList<Integer> vertical = new ArrayList<>();

        horizontal.add(0);
        horizontal.add(h);
        vertical.add(0);
        vertical.add(w);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int line = Integer.parseInt(st.nextToken());

            if (dir == 0) horizontal.add(line); 
            else vertical.add(line);
        }

        Collections.sort(horizontal);
        Collections.sort(vertical);

        int maxH = 0;
        for (int i = 1; i < horizontal.size(); i++) {
            maxH = Math.max(maxH, horizontal.get(i) - horizontal.get(i - 1));
        }

        int maxW = 0;
        for (int i = 1; i < vertical.size(); i++) {
            maxW = Math.max(maxW, vertical.get(i) - vertical.get(i - 1));
        }

        System.out.println(maxW * maxH);
    }
}
