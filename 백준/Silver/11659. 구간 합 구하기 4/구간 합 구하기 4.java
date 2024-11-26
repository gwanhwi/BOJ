import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] numbersSum = new int[N+1];
        for(int i=1;i<=N;i++){
            numbersSum[i]=Integer.parseInt(st.nextToken()) + numbersSum[i-1];
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken());
            int endIdx = Integer.parseInt(st.nextToken());
            int partSum = numbersSum[endIdx] - numbersSum[startIdx-1];
            sb.append(partSum).append("\n");
        }
        System.out.println(sb);
    }
}