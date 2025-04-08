import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        for(int i=1;i<=K;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                int n = Integer.parseInt(st.nextToken());
                arr[j] = n;
            }
            Arrays.sort(arr);
            int maxGap=0;
            for(int j=0;j<N-1;j++){
                maxGap= Math.max(maxGap, arr[j+1]-arr[j]);
            }
            sb.append("Class ").append(i).append("\n");
            sb.append("Max "+arr[N-1]+", Min "+arr[0]+", Largest gap ").append(maxGap).append("\n");
        }
        System.out.println(sb);
    }
}