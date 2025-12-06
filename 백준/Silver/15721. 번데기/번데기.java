import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine().trim());
        int T = Integer.parseInt(br.readLine().trim());
        int want = Integer.parseInt(br.readLine().trim());

        int bunCount = 0;
        int degiCount = 0;
        int round = 1;
        int turn = 0;
        
        while (true) {
            int[] base = {0, 1, 0, 1};
            for (int x : base) {
                turn++;
                if (x == 0) bunCount++;
                else degiCount++;
                
                if ((want == 0 && bunCount == T) || (want == 1 && degiCount == T)) {
                    System.out.println((turn - 1) % A);
                    return;
                }
            }
            for (int i = 0; i < round + 1; i++) {
                turn++;
                bunCount++;
                if (want == 0 && bunCount == T) {
                    System.out.println((turn - 1) % A);
                    return;
                }
            }
            for (int i = 0; i < round + 1; i++) {
                turn++;
                degiCount++;
                if (want == 1 && degiCount == T) {
                    System.out.println((turn - 1) % A);
                    return;
                }
            }
            round++;
        }
    }
}
