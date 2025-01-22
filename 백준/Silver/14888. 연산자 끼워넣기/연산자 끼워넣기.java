import java.io.*;
import java.util.*;
public class Main {
    static int N;
    static int[] A;
    static int[] operator; // + - * /
    static int max=Integer.MIN_VALUE;
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[N];
        operator= new int[4];
        for(int i=0;i<N;i++){
            A[i]= Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            operator[i]= Integer.parseInt(st.nextToken());
        }
        recursive(1,A[0]);
        sb.append(max).append("\n").append(min);
        System.out.println(sb);
    }
    public static void recursive(int idx, int sum){
        if(idx==N){
            max=Math.max(max,sum);
            min=Math.min(min,sum);
            return;
        }
        if(operator[0]>0){
            operator[0]--;
            recursive(idx+1, sum+A[idx]);
            operator[0]++;
        }
        if(operator[1]>0){
            operator[1]--;
            recursive(idx+1, sum-A[idx]);
            operator[1]++;
        }
        if(operator[2]>0){
            operator[2]--;
            recursive(idx+1, sum*A[idx]);
            operator[2]++;
        }
        if(operator[3]>0){
            operator[3]--;
            recursive(idx+1, sum/A[idx]);
            operator[3]++;
        }
    }
}
