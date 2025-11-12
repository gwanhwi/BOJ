import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        boolean isImyeon = isImyeonsu(n);
        boolean isImhyun = isImhyunsu(n);

        if (isImyeon && isImhyun) {
            System.out.println(4);
        } else if (isImyeon) {
            System.out.println(1);
        } else if (isImhyun) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

    private static boolean isImyeonsu(int n) {
        if (n < 6 && n != 4) return false;
        int sum = 0;
        int t = n;
        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }
        if (sum % 2 == 0) return false;

        for (int a = 0; a * 2 <= n; a++) {
            for (int b = 0; a*2 + b*3 <= n; b++) {
                int rem = n - (a*2 + b*3);
                if (rem >= 0 && rem % 4 == 0) {
                    if (a + b + rem/4 >= 1) return true;
                }
            }
        }
        return false;
    }

    private static boolean isImhyunsu(int n) {
        if (n == 2 || n == 4) return true;
        if (n < 4) return false;
        if (isPrime(n)) return false;
        int distinctCount = countDistinctPrimeFactors(n);
        return distinctCount % 2 == 0;
    }

    private static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    private static int countDistinctPrimeFactors(int x) {
        int count = 0;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                count++;
                while (x % i == 0) {
                    x /= i;
                }
            }
        }
        if (x > 1) count++;
        return count;
    }
}
