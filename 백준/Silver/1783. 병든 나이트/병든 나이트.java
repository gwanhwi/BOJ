import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 1;
        if(N==1) answer=1;
        else if (N==2) {
            answer = (M+1)/2 > 4 ? 4 : (M+1)/2;
        } else if (N>=3 && M<7) {
            answer = Math.min(4,M);
        } else if (N>=3 && M>=7) {
            answer = M-2;
        }
        System.out.println(answer);
    }
}