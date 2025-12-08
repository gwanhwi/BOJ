import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        List<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else {
                    if (sb.length() > 0) {
                        String numStr = sb.toString().replaceFirst("^0+(?!$)", "");
                        list.add(new BigInteger(numStr));
                        sb.setLength(0);
                    }
                }
            }
            if (sb.length() > 0) {
                String numStr = sb.toString().replaceFirst("^0+(?!$)", "");
                list.add(new BigInteger(numStr));
            }
        }

        Collections.sort(list);

        StringBuilder out = new StringBuilder();
        for (BigInteger num : list) {
            out.append(num.toString()).append('\n');
        }
        System.out.print(out.toString());
    }
}
