import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int gcd = GCD(A,B);
            sb.append(A*B/gcd).append("\n");
        }

        System.out.println(sb);
    }
    public static int GCD(int a, int b){
        if(a%b==0) return b;
        return GCD(b,a%b);
    }
}