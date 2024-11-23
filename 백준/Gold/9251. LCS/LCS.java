import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[][] dp = new int[str1.length()+1][str2.length()+1]; // 부분문자열길이

        for(int i=1; i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                char c1 = str1.charAt(i-1);
                char c2 = str2.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[str1.length()][str2.length()]);
    }
}