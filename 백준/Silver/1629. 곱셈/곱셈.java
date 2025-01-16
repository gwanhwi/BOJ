import java.io.*;
import java.util.*;
public class Main {
    static long sum=0;
    static int C;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(recursive(A,B)%C);
    }
    public static long recursive(int A, int B){
        if(B==0) return 1;
        if(B==1) return A%C;
        if(B%2==1) return (long)A*recursive(A,B-1)%C;
        else {
            long half = recursive(A,B/2);
            return half*half %C;
        }
    }
}
