import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count=9;
        int val=1;
        int answer=0;
        while(n>=count){
            answer += count*val;
            val++;
            n-=count;
            count*=10;
        }
        answer+= n*val;
        System.out.println(answer);
    }
}