import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        arr[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 6 == 0) {
                arr[i] = Math.min(arr[i - 1], Math.min(arr[i / 2], arr[i / 3])) + 1;
            } else if (i % 3 == 0) {
                arr[i] = Math.min(arr[i / 3], arr[i - 1]) + 1;
            } else if (i % 2 == 0) {
                arr[i] = Math.min(arr[i / 2], arr[i - 1]) + 1;
            } else arr[i] = arr[i - 1] + 1;
        }
        System.out.println(arr[n]);
    }
}