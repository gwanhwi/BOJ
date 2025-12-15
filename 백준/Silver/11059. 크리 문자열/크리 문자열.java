import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int n = s.length();

        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + (s.charAt(i - 1) - '0');
        }

        int maxLen = 0;

        for (int len = n - (n % 2); len >= 2; len -= 2) {
            for (int start = 0; start + len <= n; start++) {
                int mid = start + len / 2;
                int leftSum = prefix[mid] - prefix[start];
                int rightSum = prefix[start + len] - prefix[mid];
                if (leftSum == rightSum) {
                    System.out.println(len);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
