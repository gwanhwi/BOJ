import java.io.*;
import java.util.*;

class Main {
    static int[][] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        dp = new int[S][4];
        int count=0;
        setDP(0,str.charAt(0));
        for(int i=1;i<S;i++){
            char c = str.charAt(i);
            dp[i][0]=dp[i-1][0];
            dp[i][1]=dp[i-1][1];
            dp[i][2]=dp[i-1][2];
            dp[i][3]=dp[i-1][3];
            switch (c){
                case 'A':
                    dp[i][0]++;
                    break;
                case 'C':
                    dp[i][1]++;
                    break;
                case 'G':
                    dp[i][2]++;
                    break;
                case 'T':
                    dp[i][3]++;
                    break;
            }
        }
        for(int i=P-1;i<S;i++){
            int[] substrACGT = new int[4];
            substrACGT[0]=dp[i][0];
            substrACGT[1]=dp[i][1];
            substrACGT[2]=dp[i][2];
            substrACGT[3]=dp[i][3];
            if(i>=P){
                for(int j=0;j<4;j++){
                    substrACGT[j] = dp[i][j]-dp[i-P][j];
                }
            }

            if(substrACGT[0]>=A && substrACGT[1]>=C && substrACGT[2]>=G && substrACGT[3]>=T) count++;
        }
        System.out.println(count);
    }
    public static void setDP(int idx, char c){
        switch (c){
            case 'A':
                dp[idx][0]=1;
                break;
            case 'C':
                dp[idx][1]=1;
                break;
            case 'G':
                dp[idx][2]=1;
                break;
            case 'T':
                dp[idx][3]=1;
                break;
        }
    }
}