import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    static int[][] memory;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        memory=new int[31][31];
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(combination(M,N)).append("\n");
        }
        System.out.println(sb);
    }
    public static int combination(int n, int r){
        if(memory[n][r]>0) return memory[n][r];
        if(r==0 || n==r){
            return 1;
        }
        memory[n][r]=combination(n-1,r-1) + combination(n-1,r);
        return memory[n][r];
    }
}
