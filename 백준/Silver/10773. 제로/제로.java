import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        //StringTokenizer st=new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0)
                stack.push(num);
            else
                stack.pop();
        }
        int sum=0;
        int len = stack.size();
        for(int i=0;i<len;i++){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
