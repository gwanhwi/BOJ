import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean[][] filled = new boolean[101][101];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int leftTerm = Integer.parseInt(st.nextToken());
            int rightTerm=Integer.parseInt(st.nextToken());
            for(int j=leftTerm;j<leftTerm+10;j++){
                for(int k=rightTerm;k<rightTerm+10;k++){
                    filled[j][k]=true;
                }
            }
        }
        int count=0;
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                if(filled[i][j]) count++;
            }
        }
        System.out.println(count);
    }
}