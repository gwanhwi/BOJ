import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Pattern p = Pattern.compile("^[A-F]?A+F+C+[A-F]?$");
        while (T-- > 0) {
            String s = br.readLine();
            System.out.println(p.matcher(s).matches() ? "Infected!" : "Good");
        }
    }
}
