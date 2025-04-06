import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseNum=1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if(L==0) break;
            int answer = V/P*L + Math.min(V%P, L);

            sb.append("Case ").append(caseNum).append(": ").append(answer).append("\n");
            caseNum++;
        }
        System.out.println(sb);
    }
}