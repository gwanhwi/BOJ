import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        BigInteger low = BigInteger.ZERO;
        BigInteger high = n;
        while (low.compareTo(high) <= 0) {
            BigInteger mid = low.add(high).divide(BigInteger.valueOf(2));
            int cmp = mid.multiply(mid).compareTo(n);
            if (cmp == 0) {
                System.out.println(mid);
                return;
            } else if (cmp < 0) {
                low = mid.add(BigInteger.ONE);
            } else {
                high = mid.subtract(BigInteger.ONE);
            }
        }
        System.out.println(high);
    }
}
