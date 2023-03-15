import javax.xml.stream.events.StartDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static int divide(int n){
        int count = n/5;
        while(count>=0){
            if((n-(5*count)) %3 ==0)
                return count;
            else count--;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        //StringTokenizer st=new StringTokenizer(br.readLine());
        int count = divide(n);
        int ans=-1;
        if(count > -1)
            ans = count + (n-(5*count))/3;
        sb.append(ans);
        System.out.println(sb);
    }
}
