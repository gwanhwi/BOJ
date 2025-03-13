import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        for(int i=0;i<M;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int price=0;
        int profit=0;
        for(int i=M-1;i>=0;i--){
            if(M-i>N) break;
            int sum = arr[i] * (M-i);
            if(sum >= profit){
                profit = sum;
                price=arr[i];
            }
        }
        sb.append(price).append(" ").append(profit);
        System.out.println(sb);
    }
}