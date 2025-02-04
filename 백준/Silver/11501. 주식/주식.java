import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] price = new int[N];
            for(int j=0;j<N;j++){
                price[j] = Integer.parseInt(st.nextToken());
            }
            long profit=0;
            int futurePrice=price[N-1];
            for(int j=N-2;j>=0;j--){
                if(price[j]<futurePrice){
                    profit+=futurePrice-price[j];
                }
                else{
                    futurePrice=price[j];
                }
            }
            sb.append(profit).append("\n");
        }
        System.out.println(sb);
    }
}