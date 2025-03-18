import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int rowLen = str.length()/K;
        char[][] arr = new char[rowLen][K];
        for(int i=0;i<str.length();i++){
            int row = i/K;
            int col = i%K;
            if(row%2==1){
                col = K-i%K-1;
            }
            arr[row][col] = str.charAt(i);
        }

        for(int j=0;j<K;j++){
            for(int i=0;i<rowLen;i++){
                sb.append(arr[i][j]);
            }
        }
        System.out.println(sb);
    }
}