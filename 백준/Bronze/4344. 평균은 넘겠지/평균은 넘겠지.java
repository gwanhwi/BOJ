import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int C = Integer.parseInt(br.readLine());
        for(int i=0;i<C;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            double avg =0;
            for(int j=0;j<N;j++){
                arr[j] = Integer.parseInt(st.nextToken());
                avg+=arr[j];
            }
            avg /=N;
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[j] > avg){
                    count++;
                }
            }
            double answer = (double)count/N*100;

            sb.append(String.format("%.3f", answer)).append("%\n");
        }
        System.out.println(sb);
    }
}