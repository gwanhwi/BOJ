import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstRingLen = Integer.parseInt(st.nextToken());
        for(int i=0;i<N-1;i++){
            int ringLen = Integer.parseInt(st.nextToken());
            int gcd = GCD(firstRingLen,ringLen);
            sb.append(firstRingLen/gcd).append("/").append(ringLen/gcd);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static int GCD(int a, int b){
        if(a%b==0) return b;
        return GCD(b,a%b);
    }
}