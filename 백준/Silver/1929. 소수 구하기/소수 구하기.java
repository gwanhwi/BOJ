import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        //int n = Integer.parseInt(br.readLine());
        int start= Integer.parseInt(st.nextToken());
        int fin = Integer.parseInt(st.nextToken());
        for(int i=start;i<=fin;i++){
            if(i==1)
                continue;
            if(i==2){
                sb.append(i).append('\n');
                continue;
            }
            if(go(i))
                sb.append(i).append('\n');
        }
        System.out.println(sb);
    }

    public static boolean go(int num){
        for(int i=2;i*i<num+1;i++){
            if(num%i==0)
                return false;
        }
        return  true;
    }
}
