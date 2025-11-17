import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            if (str.equals("*")) break;
            boolean surprising = true;
            int len = str.length();
            for (int d = 1; d < len && surprising; d++) {
                Set<String> seen = new HashSet<>();
                for (int i = 0; i + d < len; i++) {
                    String pair = "" + str.charAt(i) + str.charAt(i + d);
                    if (seen.contains(pair)) {
                        surprising = false;
                        break;
                    }
                    seen.add(pair);
                }
            }
            if (surprising) {
                System.out.println(str + " is surprising.");
            } else {
                System.out.println(str + " is NOT surprising.");
            }
        }
    }
}
