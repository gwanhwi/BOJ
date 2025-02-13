import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] arr = new int[B+1];
        int n=1;
        int idx=1;
        while(idx<=B){
            for(int i=0;i<n;i++){
                if(idx==B+1) break;
                arr[idx++]=n;
            }
            n++;
        }
        int sum=0;
        for(int i=A;i<=B;i++) sum+=arr[i];
        System.out.println(sum);
    }
}