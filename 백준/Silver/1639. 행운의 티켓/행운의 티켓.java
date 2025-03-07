import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int answer = 0;
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<=S.length();j++){
                if((j-i)%2 == 1) continue;
                String partialStr = S.substring(i,j);
                int leftSum=0;
                int rightSum=0;
                for(int k=0;k<partialStr.length()/2;k++){
                    leftSum+=partialStr.charAt(k)-'0';
                    rightSum+=partialStr.charAt(k+partialStr.length()/2)-'0';
                }
                if(leftSum==rightSum) answer=Math.max(answer, partialStr.length());
            }
        }
        System.out.println(answer);
    }
}