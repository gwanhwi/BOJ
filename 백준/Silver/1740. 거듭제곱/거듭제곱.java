import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long ans = 0;
        long power = 1;
        long n = N;
        while (n > 0) {
            if ((n & 1) == 1) ans += power;
            power *= 3;
            n >>= 1;
        }
        System.out.println(ans);
    }
}
