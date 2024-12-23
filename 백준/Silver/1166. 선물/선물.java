import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        double answer=0;
        double start=0;
        double end=Math.min(Math.min(L,W),H);

        for(int i=0;i<10000;i++){
            double mid=(start+end)/2;
            if((long)(L/mid)*(long)(W/mid)*(long)(H/mid) >=N){
                answer=Math.max(mid,answer);
                start=mid;
            }
            else{
                end=mid;
            }
        }

        System.out.println(answer);
    }
}