import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] fibo = new int[41][2];
        fibo[0][0]=1;
        fibo[0][1]=0;
        fibo[1][0]=0;
        fibo[1][1]=1;
        for(int i=2;i<fibo.length;i++){
            fibo[i][0]=fibo[i-1][0]+fibo[i-2][0];
            fibo[i][1]=fibo[i-1][1]+fibo[i-2][1];
        }
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(fibo[n][0]).append(" ").append(fibo[n][1]).append("\n");
        }

        System.out.println(sb);
    }
}
