import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            count=0;
            dfs(n,0);
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
    public static void dfs(int n, int sum){
        if(sum==n) count++;
        else if(sum>n) return;
        for(int i=1;i<=3;i++){
            dfs(n,sum+i);
        }
    }

}
