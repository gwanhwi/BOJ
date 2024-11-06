import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int M =0;
        for(int i=0;i<N;i++){
            M=Math.max(M,arr[i]);
        }
        double sum=0;
        double[] newScore = new double[N];
        for(int i=0;i<N;i++){
            newScore[i]=(double)arr[i]/M*100;
            sum+=newScore[i];
        }
        System.out.println(sum/N);
    }

}