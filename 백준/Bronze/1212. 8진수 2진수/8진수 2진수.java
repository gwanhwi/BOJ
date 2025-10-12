import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octal = br.readLine().trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < octal.length(); i++) {
            int num = octal.charAt(i) - '0';
            String bin = Integer.toBinaryString(num);
            if (i != 0) while (bin.length() < 3) bin = "0" + bin;
            sb.append(bin);
        }
        System.out.println(sb);
    }
}
