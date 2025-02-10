import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int child = A*b + a*B;
        int parent = B*b;
        int lcm = LCM(child,parent);
        child /=lcm;
        parent /=lcm;
        sb.append(child+" "+parent);
        System.out.println(sb);
    }
    public static int LCM(int a, int b){
        if(a%b==0){
            return b;
        }
        return LCM(b,a%b);
    }
}