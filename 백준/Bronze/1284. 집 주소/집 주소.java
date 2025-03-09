import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            int width=1; //기본 왼쪽 여백
            String str = Integer.toString(n);
            for(int i=0;i<str.length();i++){
                int parse = str.charAt(i)-'0';
                width+=calWidth(parse)+1; //글자마다 오른쪽 여백 1센티
            }
            sb.append(width).append("\n");
        }

        System.out.println(sb);
    }
    public static int calWidth(int n){
        switch (n){
            case 0: return 4;
            case 1: return 2;
            default: return 3;
        }
    }
}