import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] A = new Integer[N];
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(A,Collections.reverseOrder());
        int sum=0;
        int count=0;
        while(sum<=K){
            if(sum==K) break;
            for(int i=0;i<N;i++){
                if(sum+A[i]>K) continue;
                sum+=A[i];
                break;
            }
            count++;
        }
        System.out.println(count);
    }

}