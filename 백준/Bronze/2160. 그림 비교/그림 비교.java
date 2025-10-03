import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] pictures = new String[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                pictures[i][j] = br.readLine();
            }
        }

        int minDiff = Integer.MAX_VALUE;
        int pic1 = 0, pic2 = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = 0;
                for (int r = 0; r < 5; r++) {
                    for (int c = 0; c < 7; c++) {
                        if (pictures[i][r].charAt(c) != pictures[j][r].charAt(c)) {
                            diff++;
                        }
                    }
                }
                if (diff < minDiff) {
                    minDiff = diff;
                    pic1 = i + 1;
                    pic2 = j + 1;
                }
            }
        }

        System.out.println(pic1 + " " + pic2);
    }
}
