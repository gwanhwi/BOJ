import java.io.*;
import java.util.*;

public class Main {
    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        long num = 1;
        long den = a[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            long newNum = den;
            long newDen = a[i] * den + num;
            num = newNum;
            den = newDen;
        }

        long finalNum = den - num;
        long finalDen = den;
        long g = gcd(finalNum, finalDen);
        finalNum /= g;
        finalDen /= g;

        System.out.println(finalNum);
        System.out.println(finalDen);
    }
}
