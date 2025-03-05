import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int total=countCombination(N,M);
        int sum=0;
        for(int i=0;i<K;i++){
            sum+=countCombination(N-M,M-i)*countCombination(M,i);
        }
        int possibleCount = total-sum;
        System.out.println((double)possibleCount/total);
    }
    public static int countCombination(int n, int c){
        if(n<c){
            return 0;
        }
        int total=1;
        int div=1;
        for(int i=0;i<c;i++){
            total*=(n-i);
            div*=(i+1);
        }
        return total/div;
    }
}