import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minPakegePrice=Integer.MAX_VALUE;
        int minOnePrice=Integer.MAX_VALUE;
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            minPakegePrice = Math.min(minPakegePrice,Integer.parseInt(st.nextToken()));
            minOnePrice = Math.min(minOnePrice,Integer.parseInt(st.nextToken()));
        }
        int answer=0;
            if(N%6 == 0) answer=Math.min(minPakegePrice*(N/6), minOnePrice*N);
            else answer= Math.min(minPakegePrice*(N/6+1),Math.min(minPakegePrice*(N/6)+minOnePrice*(N%6),minOnePrice*N));
        System.out.println(answer);
    }
}