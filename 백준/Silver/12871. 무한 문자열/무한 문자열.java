import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        int lenA = A.length();
        int lenB = B.length();

        int lcm = lenA * lenB / gcd(lenA, lenB);

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < lcm / lenA; i++) s1.append(A);
        for (int i = 0; i < lcm / lenB; i++) s2.append(B);

        if (s1.toString().equals(s2.toString())) System.out.println(1);
        else System.out.println(0);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
