import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long n = gcd(B,A);
        for(int i=0;i<n;i++) sb.append(1);
        System.out.println(sb);
    }
    public static long gcd(long a, long b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
}