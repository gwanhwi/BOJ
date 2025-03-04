import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        int maxLen=0;
        for(int i=0;i<K;i++){
            arr[i] = Integer.parseInt(br.readLine());
            maxLen=Math.max(maxLen, arr[i]);
        }
        long left = 1;
        long right = maxLen;
        long answer=0;
        while(left<=right){
            long mid = (left+right) / 2;
            int count=0;
            for(int i=0;i<K;i++){
                count+=arr[i]/mid;
            }
            if(count<N){
                right=mid-1;
            } else{
                answer=mid;
                left = mid+1;
            }
        }
        System.out.println(answer);
    }
}