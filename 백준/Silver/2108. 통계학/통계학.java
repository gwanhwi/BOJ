import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        double avg = 0;
        int center = arr[n / 2];
        int[] mostAppear = new int[8001];
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            avg += arr[i];
        }
        for (int i = 0; i < n; i++) {
            mostAppear[arr[i] + 4000]++;
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];

        }
        int most = 0;
        int mostval = -4000;
        for (int i = 0; i < 8001; i++) {
            if (most < mostAppear[i]) {
                mostval = i - 4000;
                most = mostAppear[i];
            }
        }
        for (int i = mostval + 4001; i < 8001; i++) {
            if (most == mostAppear[i]) {
                mostval = i - 4000;
                break;
            }
        }
        sb.append(Math.round(avg / (double)n)).append('\n');
        sb.append(center).append('\n');
        sb.append(mostval).append('\n');
        sb.append(max - min).append('\n');
        System.out.println(sb);

    }

}
