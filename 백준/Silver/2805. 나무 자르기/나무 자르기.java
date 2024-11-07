import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(binarySearch());
    }
    public static int binarySearch(){
        int start =0;
        int end = 1000000000;
        int mid;
        while(start<=end) {
            mid=(start+end)/2;
            long sum=0;
            for(int i=0;i<N;i++){
                if(arr[i]-mid <=0) continue;
                sum+= arr[i]-mid;
            }
            if (sum < M) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}