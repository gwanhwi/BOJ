import java.io.*;
import java.util.*;

public class Main {
    static long n, answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long answer = 0;
        long left = 0;
        long right = n;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (n <= Math.pow(mid, 2)){
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(answer);
    }
}