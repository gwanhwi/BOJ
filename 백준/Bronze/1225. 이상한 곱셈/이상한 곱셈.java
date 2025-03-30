import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        long sum=0;
        for(int i=0;i<A.length();i++){
            int a = A.charAt(i)-'0';
            for(int j=0;j<B.length();j++){
                int b = B.charAt(j)-'0';
                sum+=(long)a*b;
            }
        }

        System.out.println(sum);
    }
}