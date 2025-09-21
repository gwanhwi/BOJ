import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] price = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < 14; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        long junCash = N;
        long junStock = 0;
        for (int i = 0; i < 14; i++) {
            if (price[i] <= junCash) {
                long cnt = junCash / price[i];
                junStock += cnt;
                junCash -= cnt * price[i];
            }
        }
        long junTotal = junCash + junStock * price[13];

        long sungCash = N;
        long sungStock = 0;
        int downCount = 0;
        int upCount = 0;
        for (int i = 1; i < 14; i++) {
            if (price[i] < price[i - 1]) {
                downCount++;
                upCount = 0;
            } else if (price[i] > price[i - 1]) {
                upCount++;
                downCount = 0;
            } else {
                upCount = 0;
                downCount = 0;
            }

            if (downCount >= 3) {
                long cnt = sungCash / price[i];
                if (cnt > 0) {
                    sungStock += cnt;
                    sungCash -= cnt * price[i];
                }
            }
            else if (upCount >= 3) {
                if (sungStock > 0) {
                    sungCash += sungStock * price[i];
                    sungStock = 0;
                }
            }
        }
        long sungTotal = sungCash + sungStock * price[13];

        if (junTotal > sungTotal) {
            System.out.println("BNP");
        } else if (junTotal < sungTotal) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
