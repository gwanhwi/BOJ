import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int S=0;
        
        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operation =  st.nextToken();
            int x = -1;
            if(st.hasMoreTokens()) x=Integer.parseInt(st.nextToken());
            if(operation.equals("add")){
                S |= 1<<x;
            }
            else if(operation.equals("remove")) {
                S ^=S&1<<x;
            }
            else if(operation.equals("check")) {
                int n= (S & 1<<x)==0 ? 0 : 1;
                sb.append(n).append("\n");
            }
            else if(operation.equals("toggle")) {
                S ^=1<<x;
            }
            else if(operation.equals("all")) {
                S=0;
                for(int j=1;j<=20;j++)
                    S |=1<<j;
            }
            else if(operation.equals("empty")){
                S=0;
            }
        }
        System.out.println(sb);
    }
}