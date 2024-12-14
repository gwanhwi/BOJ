import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y=0;
        int M=0;
        for(int i=0;i<N;i++){
            int n = Integer.parseInt(st.nextToken());
            Y+= n/30*10+10;
            M+=n/60*15+15;
        }
        if(Y < M)sb.append("Y ").append(Y);
        else if (Y > M) sb.append("M ").append(M);
        else sb.append("Y M ").append(Y);
        System.out.println(sb);
    }
}