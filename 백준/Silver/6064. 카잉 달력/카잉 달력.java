import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int LCM=0; //최소공배수
            for(int j=1;j<=N;j++){
                if(M*j%N==0){
                    LCM = M*j;
                    break;
                }
            }
            boolean hasAnswer=false;
            for(int j=x;j<=LCM;j+=M){
                if(j%N==y) {
                    hasAnswer=true;
                    sb.append(j).append("\n");
                    break;
                }
                if(N==y && j%N==0){
                    hasAnswer=true;
                    sb.append(j).append("\n");
                    break;
                }
            }
            if(!hasAnswer) sb.append(-1).append("\n");
        }
        System.out.println(sb);
    }
}