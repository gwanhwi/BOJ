import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int num1= Integer.parseInt(st.nextToken());
        int num2= Integer.parseInt(st.nextToken());
        int ans1=0;
        int ans2=0;
        ans1=gcd(num1,num2);
        ans2=ans1*(num1/ans1)*(num2/ans1);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}