import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.charAt(0) == '_' || s.charAt(s.length() - 1) == '_' || Character.isUpperCase(s.charAt(0))) {
            System.out.println("Error!");
            return;
        }

        boolean isJava = false, isCpp = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_') {
                if (isJava) {
                    System.out.println("Error!");
                    return;
                }
                if (i + 1 >= s.length() || s.charAt(i + 1) == '_' || Character.isUpperCase(s.charAt(i + 1))) {
                    System.out.println("Error!");
                    return;
                }
                sb.append(Character.toUpperCase(s.charAt(i + 1)));
                i++;
                isCpp = true;
            } else if (Character.isUpperCase(c)) {
                if (isCpp) {
                    System.out.println("Error!");
                    return;
                }
                sb.append('_').append(Character.toLowerCase(c));
                isJava = true;
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
