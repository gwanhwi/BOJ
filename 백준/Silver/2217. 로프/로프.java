import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] weight=new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
            weight[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(weight);
        for(int i=0;i<N;i++){
            sum=Math.max(sum,weight[i]*(N-i));
        }
        System.out.println(sum);
    }
}
